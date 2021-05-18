package com.itheima.array;

public class Demo5Array {
    /*
        两个数组指向相同
     */

    public static void main(String[] args) {
        int[] arr1 = new int[2];
        arr1[0] = 11;
        arr1[1] = 22;

        /*
            数组类型的变量应该记录什么?
                地址值
         */
        int[] arr2 = arr1;
        arr2[0] = 33;

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println("---------");
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

    }
}
