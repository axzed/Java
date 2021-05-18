package com.itheima.test;

import java.util.Scanner;

public class Test2Array {
    /*
        需求: 从数组中查找最大值

                int[] arr = {12,45,98,73,60};

        实现步骤:
                1. 假设数组中的第一个元素为最大值
                2. 遍历数组, 获取每一个元素, 准备进行比较
                3. 如果比较的过程中, 出现了比max更大的, 让max记录更大的值
                4. 循环结束后, 打印最大值.
     */
    public static void main(String[] args) {
        int[] arr = {12,45,98,73,60};
        // 1. 假设数组中的第一个元素为最大值
        int max = arr[0];
        // 2. 遍历数组, 获取每一个元素, 准备进行比较
        for(int i = 1; i < arr.length; i++){
            // 3. 如果比较的过程中, 出现了比max更大的, 让max记录更大的值
            if(arr[i] > max){
                max = arr[i];
            }
        }
        //  4. 循环结束后, 打印最大值.
        System.out.println("max:" + max);
    }
}
