package streamm;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import sethashset.laosi;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class 老师 implements Comparable<sethashset.laosi>
            //结论：TreeSet集合要求集合中的元素必须实现Comparable接口，并且重写compareTo方法，按照升序排序

    {
        private String name;
        private int age;
        private double salary;

        @Override
        public String toString() {
            return "laosi{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", salary=" + salary +
                    '}'+"\n";
        }

        @Override
        // t2.compareTo(t1)
        // t2 == this 比较者
        // t1 ==o被比较者
        //规定：如果你认为左边大于右边，返回正数
        //规定：如果你认为左边小于右边，返回负数
        //规定：如果你认为左边等于右边，返回0
        public int compareTo(sethashset.laosi o) {
            //按照年龄升序排序、
//        if (this.getAge() > o.getAge()) return 1;
//        if (this.getAge() < o.getAge()) return -1;
//        return 1;//想去重就写0不去重就写1
            return this.getAge() - o.getAge();//升序
//        return o.getAge() - this.getAge();//降序
        }
    }


