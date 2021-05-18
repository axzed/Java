package com.itheima.test;

import java.util.Scanner;

public class Test3Array {
    /*
        需求：键盘录入5个整数，存储到数组中，并对数组求和

        思路：
            1.创建键盘录入对象，准备键盘录入
            2.定义一个求和变量，准备记录累加后的结果
            3.动态初始化一个长度为5的int数组，准备存储键盘录入的数值
            4.将键盘录入的数值存储到数组中
            5.遍历数组，取出每一个元素，并求和
            6.输出总和
     */
    public static void main(String[] args) {
        // 1.创建键盘录入对象，准备键盘录入
        Scanner sc = new Scanner(System.in);
        // 2.定义一个求和变量，准备记录累加后的结果
        int sum = 0;
        // 3.动态初始化一个长度为5的int数组，准备存储键盘录入的数值
        int[] arr = new int[5];
        // 4.将键盘录入的数值存储到数组中
        for(int i = 0; i < arr.length; i++){
            System.out.println("请输入第" + (i+1) + "个整数:");
            //arr[i] = 10;
            arr[i] = sc.nextInt();
        }

        // 5.遍历数组，取出每一个元素，并求和
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        // 6.输出总和
        System.out.println("sum:" + sum);

    }
}
