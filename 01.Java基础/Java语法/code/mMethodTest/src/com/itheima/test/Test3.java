package com.itheima.test;

public class Test3 {
    /*
        需求：设计一个方法，该方法能够同时获取数组的最大值，和最小值

        注意: return语句, 只能带回一个结果.
     */
    public static void main(String[] args) {

        int[] arr = {11,55,33,22,44};

        int[] maxAndMin = getMaxAndMin(arr);

        System.out.println(maxAndMin[0]);
        System.out.println(maxAndMin[1]);

    }

    public static int[] getMaxAndMin(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }

        int[] maxAndMin = {min, max};

        return maxAndMin;
    }
}
