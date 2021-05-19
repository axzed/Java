package com.itheima.constructor;

public class Student {
    /*
        格式:

               1. 方法名需要跟类名相同, 大小写也要一致
               2. 没有返回值类型, 连void都没有
               3. 没有具体的返回值(不能由return带回具体的结果)
     */

    private String name;
    private int age;

    // 1. 如果一个类中没有编写任何构造方法, 系统将会提供一个默认的无参数构造方法
    public Student(){}

    // 2. 如果手动编写了构造方法, 系统就不会再提供默认的无参数构造方法了
    public Student(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("我是Student类的构造方法");
    }

    public void show(){
        System.out.println(name + "..." + age);
    }
}
