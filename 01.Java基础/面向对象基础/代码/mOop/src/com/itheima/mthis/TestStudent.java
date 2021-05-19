package com.itheima.mthis;

public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("[打印对象名]-->  s1");
        System.out.println(s1);
        s1.setName("张三");

        System.out.println("----------------------");

        Student s2 = new Student();
        System.out.println("[打印对象名]-->  s2");
        System.out.println(s2);
        s2.setName("李四");
    }
}
