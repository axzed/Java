package com.itheima.array;

public class Demo3ArrayIndex {
    /*
        数组动态初始化:
                初始化的时候, 手动指定数组长度, 系统会为数组容器分配初始值.

        数组的元素访问格式:
                数组名[索引]

                索引: 数组中数据的编号方式, 编号从0开始
                作用: 访问数组容器中的空间位置

        注意:
                数组在创建完毕后, 即使没有赋值, 也可以取出, 但取出的元素都是默认初始化值.

     */
    public static void main(String[] args) {
        int[] arr = new int[3];         // 0 1 2
        System.out.println(arr);        // 数组的内存地址  [I@10f87f48

        // 数组名[索引]  访问数组容器中的空间位置
        System.out.println(arr[0]);     // 0  系统自动分配的默认初始化值
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println("--------------");

        // 数组名[索引]
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
