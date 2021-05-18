package com.itheima.param;

public class Test2 {
    /*
         方法参数传递为引用数据类型 :

                传入方法中的, 是内存地址.
     */
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println("调用change方法前:" + arr[1]);
        change(arr);
        System.out.println("调用change方法后:" + arr[1]);
    }

    public static void change(int[] arr) {
        arr[1] = 200;
    }
}