package com.itheima.contrast;

public class Demo1Oop {
    /*
        需求: 遍历打印数组, 要求结果为[11, 22, 33, 44, 55]

        面向对象思想: 指挥 [对象] 来实现需求
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};

        // 1. 创建数组服务员对象
        数组服务员 二狗 = new 数组服务员();
        // 2. 指挥二狗对象, 调用内部的printArray方法遍历打印数组
        二狗.遍历打印数组(arr);

    }
}
