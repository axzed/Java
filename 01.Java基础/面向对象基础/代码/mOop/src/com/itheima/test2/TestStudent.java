package com.itheima.test2;

public class TestStudent {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.setName("张三");
        stu.setAge(23);

        System.out.println(stu.getName());
        System.out.println(stu.getAge());

        int age = stu.getAge();

        for(int i = 1; i <= age; i++){
            System.out.println("生日快乐");
        }

        stu.show();  // 仅仅是对数据做展示
    }
}
