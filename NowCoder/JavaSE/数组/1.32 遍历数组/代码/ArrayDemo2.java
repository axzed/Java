package com.nowcoder.part09;

/*
 * 遍历数组
 * */
public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 1, 5, 4, 6};

        // for 循环
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        // foreach 循环
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);
    }

}
