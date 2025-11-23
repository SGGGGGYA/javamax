package sethashset;

import java.util.Objects;

public class student {
    private String name;
    private int age;
    private String address;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    public student(String name, int age, String address, String phone) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public student() {
    }

    @Override
    //// 只要两个内容一样那么返回值一定是true
    //s3.equals(s1)
    public boolean equals(Object o) {
        //判断是否是同一个对象
        if (this == o) return true;
        //如果o是null或者o的类型和this的类型不一致，返回false
        if (o == null || getClass() != o.getClass()) return false;//
        //强转，把o转成student
        student student = (student) o;
        //比较两个属性是否相同
        return age == student.age && Objects.equals(name, student.name) && Objects.equals(address, student.address) && Objects.equals(phone, student.phone);
    }

    @Override
    public int hashCode() {
        //保证了不同学生对象，如果内容一样返回的哈希值一定是一样的，
        return Objects.hash(name, age, address, phone);
    }
}
