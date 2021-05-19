package com.itheima.object2;

/*
    学生类

    private : 私有的

    private是一个权限修饰符
    可以用来修饰成员(变量,方法)

    特点: 只能在本类当中进行访问
 */
public class Student {
    String name;
    private int age;

    // 设置值
    public void setAge(int a){
        if(a >= 0 && a <= 120){
            age = a;
        }else{
            System.out.println("您的年龄不合理");
        }
    }

    // 获取值
    public int getAge(){
        return age;
    }

    public void show(){
        System.out.println(name + "..." + age);
    }
}
