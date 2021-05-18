package com.itheima.test;

public class Test2 {
    /*
        需求：设计一个方法用于获取数组中元素的最大值

        思路：
            1.定义一个数组，用静态初始化完成数组元素初始化
            2.定义一个方法，用来获取数组中的最大值
            3.调用获取最大值方法，用变量接收返回结果
            4.把结果输出在控制台

     */
    public static void main(String[] args) {
        // 1.定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {11, 55, 22, 44, 33};
        // 3.调用获取最大值方法，用变量接收返回结果
        int max = getMax(arr);
        //  4.把结果输出在控制台
        System.out.println(max);
    }

    /*
        2.定义一个方法，用来获取数组中的最大值

        1, 参数       int[] arr
        2, 返回值类型  int
     */
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
