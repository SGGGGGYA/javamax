package sethashset;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/**
 * 教学演示：全盘遍历 + 安全删除（白名单目录）
 * 仅允许删除路径中包含 WHITE_LIST_KEY 的文件/文件夹
 */
public class DiskWalkDeletionDemo extends JFrame {

    private static final String WHITE_LIST_KEY = "F :\\"; // 白名单目录关键字
    private static final String[] COLUMN_NAMES = {"类型", "路径"};

    private final JTable table = new JTable();
    private final DefaultTableModel model = new DefaultTableModel(COLUMN_NAMES, 0);
    private final JButton scanBtn   = new JButton("开始全盘扫描");
    private final JButton deleteBtn = new JButton("执行删除（已列出）");
    private final JTextArea logArea = new JTextArea(6, 0);
    private final JLabel statusLbl  = new JLabel("就绪");

    private SwingWorker<List<Path>, Path> scanWorker;
    private SwingWorker<Void, String>     delWorker;

    public DiskWalkDeletionDemo() {
        super("全盘遍历安全删除演示（教学专用）");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(900, 600);

        table.setModel(model);
        deleteBtn.setEnabled(false);

        JPanel top = new JPanel(new FlowLayout(FlowLayout.LEFT));
        top.add(scanBtn);
        top.add(deleteBtn);
        top.add(statusLbl);

        scanBtn.addActionListener(this::startScan);
        deleteBtn.addActionListener(this::startDelete);

        add(top, BorderLayout.NORTH);
        add(new JScrollPane(table), BorderLayout.CENTER);
        add(new JScrollPane(logArea), BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    /* --------------------- 扫描阶段 --------------------- */
    private void startScan(ActionEvent e) {
        model.setRowCount(0);
        log("开始扫描全盘，白名单关键字：" + WHITE_LIST_KEY);
        scanBtn.setEnabled(false);
        deleteBtn.setEnabled(false);
        statusLbl.setText("扫描中…");

        scanWorker = new SwingWorker<>() {
            @Override
            protected List<Path> doInBackground() throws Exception {
                List<Path> list = new ArrayList<>();
                Iterable<Path> roots = FileSystems.getDefault().getRootDirectories();
                for (Path root : roots) {
                    Files.walkFileTree(root, new SimpleFileVisitor<>() {
                        @Override
                        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                            if (file.toString().contains(WHITE_LIST_KEY)) {
                                list.add(file);
                                publish(file);
                            }
                            return FileVisitResult.CONTINUE;
                        }

                        @Override
                        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                            if (dir.toString().contains(WHITE_LIST_KEY)) {
                                list.add(dir);
                                publish(dir);
                            }
                            return FileVisitResult.CONTINUE;
                        }

                        @Override
                        public FileVisitResult visitFileFailed(Path file, IOException exc) {
                            return FileVisitResult.CONTINUE; // 忽略无权限目录
                        }
                    });
                }
                return list;
            }

            @Override
            protected void process(List<Path> chunks) {
                for (Path p : chunks) {
                    model.addRow(new Object[]{Files.isDirectory(p) ? "目录" : "文件", p.toString()});
                }
                statusLbl.setText("已找到 " + model.getRowCount() + " 个目标");
            }

            @Override
            protected void done() {
                scanBtn.setEnabled(true);
                try {
                    get(); // 捕获异常
                    deleteBtn.setEnabled(model.getRowCount() > 0);
                    statusLbl.setText("扫描完成，共 " + model.getRowCount() + " 项");
                } catch (InterruptedException | CancellationException ex) {
                    log("扫描被取消");
                } catch (ExecutionException ex) {
                    JOptionPane.showMessageDialog(DiskWalkDeletionDemo.this,
                            "扫描出错：" + ex.getCause(), "错误", JOptionPane.ERROR_MESSAGE);
                }
            }
        };
        scanWorker.execute();
    }

    /* --------------------- 删除阶段 --------------------- */
    private void startDelete(ActionEvent e) {
        if (model.getRowCount() == 0) return;
        int ok = JOptionPane.showConfirmDialog(
                this,
                "确定删除表中列出的 " + model.getRowCount() + " 项吗？\n" +
                        "仅教学目录内的文件会被删除，是否继续？",
                "危险确认", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
        if (ok != JOptionPane.YES_OPTION) return;

        deleteBtn.setEnabled(false);
        scanBtn.setEnabled(false);
        statusLbl.setText("删除中…");

        delWorker = new SwingWorker<Void, String>() {
            @Override
            protected Void doInBackground() throws Exception {
                // 从后往前删，先删文件再删目录
                for (int i = model.getRowCount() - 1; i >= 0; i--) {
                    Path path = Paths.get(model.getValueAt(i, 1).toString());
                    if (!path.toString().contains(WHITE_LIST_KEY)) {
                        publish("跳过（非白名单）：" + path);
                        continue;
                    }
                    try {
                        if (Files.isDirectory(path)) {
                            Files.deleteIfExists(path);
                            publish("已删除目录：" + path);
                        } else {
                            Files.deleteIfExists(path);
                            publish("已删除文件：" + path);
                        }
                    } catch (IOException ex) {
                        publish("删除失败：" + path + " 原因：" + ex.getMessage());
                    }
                    publish(""); // 空行方便刷新
                }
                return null;
            }

            @Override
            protected void process(List<String> chunks) {
                chunks.forEach(DiskWalkDeletionDemo.this::log);
            }

            @Override
            protected void done() {
                scanBtn.setEnabled(true);
                deleteBtn.setEnabled(false);
                statusLbl.setText("删除完成");
                JOptionPane.showMessageDialog(DiskWalkDeletionDemo.this, "删除任务结束");
                model.setRowCount(0); // 清空表格
            }
        };
        delWorker.execute();
    }

    private void log(String msg) {
        if (msg == null || msg.isEmpty()) return;
        SwingUtilities.invokeLater(() -> {
            logArea.append(msg + "\n");
            logArea.setCaretPosition(logArea.getDocument().getLength());
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DiskWalkDeletionDemo::new);
    }
}
