package com.itheima.method1;

public class Demo2Method {
    /*
        需求：设计一个方法method，方法中定义一个变量(数值随意)
        判断这个变量是奇数还是偶数，并在main方法中调用method。

        1. 定义method方法
        2. 方法中定义变量, 使用if语句判断是奇数还是偶数
        3. main方法中调用method
     */
    public static void main(String[] args) {
        // 3. main方法中调用method
        method();
    }

    // 1. 定义method方法
    public static void method(){
        //  2. 方法中定义变量, 使用if语句判断是奇数还是偶数
        int num = 11;
        if(num % 2 == 0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
