package com.itheima.array;

public class Demo2Array {
    /*
        数组的动态初始化:
                        在初始化的时候, 需要手动指定数组的长度, 系统会为数组容器分配初始值.

        动态初始化格式:
                        数据类型[] 数组名 = new 数据类型[数组的长度];

        注意:
                        打印数组变量的时候, 会打印出数组的内存地址

        [I@10f87f48 :

                        @ : 分隔符
                        [ : 当前的空间是一个数组类型
                        I : 当前数组容器中所存储的数据类型
                        10f87f48 : 十六进制内存地址

                                0 1 2 3 4 5 6 7 8 9 a b c d e f
     */
    public static void main(String[] args) {
        // 数据类型[] 数组名 = new 数据类型[数组的长度];
        // 通过new关键字创建了一个int类型的数组容器, 该容器可以存储5个int类型的整数, 该容器被arr数组变量所记录
        int[] arr = new int[5];
        // [I@10f87f48
        System.out.println(arr);

        byte[] bArr = new byte[3];
        // [B@b4c966a
        System.out.println(bArr);

    }
}
