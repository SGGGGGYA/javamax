package doudiz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class 牌类 {

    private String sizs;
    private String color;
    //大小
    public int daxiao;//面向对象的

    @Override
    public String toString() {
        return sizs+color;
    }
}
