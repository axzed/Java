package com.itheima.param;

public class Test1 {
    /*
         方法参数传递为基本数据类型 :

                传入方法中的, 是具体的数值.
     */
    public static void main(String[] args) {
        int number = 100;
        System.out.println("调用change方法前:" + number);
        change(number);
        System.out.println("调用change方法后:" + number);
    }

    public static void change(int number) {
        number = 200;
    }
}

