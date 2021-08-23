package com.nowcoder.part09;

import java.util.Arrays;

/*
 * 内存中的数组
 * */
public class ArrayDemo4 {

    public static void main(String[] args) {
        // arr1 = 0x11 -> [...]
        int[] arr1 = {10, 20, 30, 40, 50};
        // arr2 = 0x11 -> [...]
        int[] arr2 = arr1;

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        arr1[0] = 11; // [11, 20, 30, 40, 50]
        arr2[1] = 22; // [11, 22, 30, 40, 50]

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }

}
