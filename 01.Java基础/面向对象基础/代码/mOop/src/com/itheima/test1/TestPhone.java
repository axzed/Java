package com.itheima.test1;

public class TestPhone {
    public static void main(String[] args) {
        // 1. 创建对象
        Phone p = new Phone();
        // 2. 给成员变量进行赋值
        p.brand = "大米";
        p.price = 2999;
        // 3. 打印赋值后的成员变量
        System.out.println(p.brand + "..." + p.price);
        // 4. 调用成员方法
        p.call("阿强");
        p.sendMessage();
    }
}
