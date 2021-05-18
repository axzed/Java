package com.itheima.test;

public class Test2_2 {
    public static void main(String[] args) {
        // 需求: 将数组中的第一个元素, 和最后一个元素进行交换.
        int[] arr = {11, 22, 33, 44, 55};
        // arr[0] arr[4]
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
