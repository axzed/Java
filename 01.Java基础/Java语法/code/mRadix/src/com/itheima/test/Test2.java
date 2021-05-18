package com.itheima.test;

public class Test2 {
    /*
        需求：已知一个数组 arr = {19, 28, 37, 46, 50}; 用程序实现把数组中的元素值交换，
          交换后的数组 arr = {50, 46, 37, 28, 19}; 并在控制台输出交换后的数组元素。

        步骤:
              1. 定义两个变量, start和end来表示开始和结束的指针.
              2. 确定交换条件, start < end 允许交换
              3. 循环中编写交换逻辑代码
              4. 每一次交换完成, 改变两个指针所指向的索引 start++, end--
              5. 循环结束后, 遍历数组并打印, 查看反转后的数组
     */
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        //  1. 定义两个变量, start和end来表示开始和结束的指针.
        int start = 0;
        int end = arr.length -1;
        //  2. 确定交换条件, start < end 允许交换
        // 4. 每一次交换完成, 改变两个指针所指向的索引 start++, end--
        // for(int start = 0, end = arr.length -1; start < end; start++, end--)
        for( ; start < end; start++, end--){
            // 3. 循环中编写交换逻辑代码
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
