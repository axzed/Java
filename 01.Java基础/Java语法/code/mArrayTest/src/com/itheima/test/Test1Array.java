package com.itheima.test;

public class Test1Array {
    /*
        数组的遍历: 通过循环获取数组中的所有元素(数据)

        动态获取数组元素个数 : 数组名.length
     */
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        // 数组名.length
        System.out.println("arr数组中元素的个数为:" + arr.length);

        //for(int i = 0; i < 5; i++){       手动写死了, 不严谨, 不推荐
        for(int i = 0; i < arr.length; i++){
            // i : 0 1 2 3 4
            System.out.println(arr[i]);
        }
    }
}
