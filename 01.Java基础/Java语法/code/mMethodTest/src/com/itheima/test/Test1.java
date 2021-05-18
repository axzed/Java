package com.itheima.test;

public class Test1 {
    /*
        需求：设计一个方法用于数组遍历，要求遍历的结果是在一行上的。例如：[11, 22, 33, 44, 55]
        思路：
            1.定义一个数组，用静态初始化完成数组元素初始化
            2.定义一个方法，对数组进行遍历
            3.遍历打印的时候，数据不换行
            4.调用遍历方法
     */
    public static void main(String[] args) {
        // 1.定义一个数组，用静态初始化完成数组元素初始化
        int[] arr = {11, 22, 33, 44, 55};
        // 4.调用遍历方法
        printArray(arr);

        System.out.println("另外一段代码逻辑 ");
    }

    /*
        2.定义一个方法，对数组进行遍历

        1, 参数           int[] arr
        2, 返回值类型      void
     */
    public static void printArray(int[] arr){

        System.out.print("[");

        for (int i = 0; i < arr.length; i++) {

            if(i == arr.length -1){
                // 如果满足条件, 说明是最后一个元素, 最后一个元素, 特殊处理
                System.out.println(arr[i] + "]");
            }else{
                // 3.遍历打印的时候，数据不换行
                System.out.print(arr[i] + ", ");
            }


        }
    }
}
