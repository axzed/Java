package com.itheima.demo;

public class Demo1Array {
    /*
        动态初始化格式：

            数据类型[][] 变量名 = new 数据类型[m][n];
            m表示这个二维数组，可以存放多少个一维数组
            n表示每一个一维数组，可以存放多少个元素
     */
    public static void main(String[] args) {
        // 数据类型[][] 变量名 = new 数据类型[m][n];
        int[][] arr = new int[3][3];
        /*
            [[I@10f87f48

            @ : 分隔符
            10f87f48 : 十六进制内存地址
            I : 数组中存储的数据类型
            [[ : 几个中括号就代表的是几维数组
         */
        System.out.println(arr);

        /*
            二维数组存储一维数组的时候, 存储的是一维数组的内存地址
         */
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr[0][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[2][2]);

        // 向二维数组中存储元素
        arr[0][0] = 11;
        arr[0][1] = 22;
        arr[0][2] = 33;

        arr[1][0] = 11;
        arr[1][1] = 22;
        arr[1][2] = 33;

        arr[2][0] = 11;
        arr[2][1] = 22;
        arr[2][2] = 33;

        // 从二维数组中取出元素并打印
        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
}
