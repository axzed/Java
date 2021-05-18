package com.itheima.demo;

public class Demo3Array {
    /*
        完整格式：数据类型[][] 变量名 = new 数据类型[][]{ {元素1, 元素2...} , {元素1, 元素2...} ...};

        简化格式: 数据类型[][] 变量名 = { {元素1, 元素2...} , {元素1, 元素2...} ...};
     */
    public static void main(String[] args) {
        int[] arr1 = {11,22,33};
        int[] arr2 = {44,55,66};

        int[][] arr = {{11,22,33}, {44,55,66}};
        System.out.println(arr[0][2]);

        int[][] array = {arr1,arr2};
        System.out.println(array[0][2]);
    }
}
