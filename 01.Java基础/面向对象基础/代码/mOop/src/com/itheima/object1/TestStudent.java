package com.itheima.object1;

public class TestStudent {
    /*
        创建对象的格式:
                类名 对象名 = new 类名();
        调用成员变量的格式:
                对象名.变量名
        调用成员方法的格式:
                对象名.方法名();
     */
    public static void main(String[] args) {
        // 类名 对象名 = new 类名();
        Student stu = new Student();
        // 对象名.变量名
        // 默认初始化值
        System.out.println(stu.name);  // null
        System.out.println(stu.age);   // 0

        stu.name = "张三";
        stu.age = 23;

        System.out.println(stu.name);  // 张三
        System.out.println(stu.age);   // 23

        // 对象名.方法名();
        stu.study();
        // com.itheima.object1.Student@b4c966a
        // 全类名(包名 + 类名)
        System.out.println(stu);
    }
}
