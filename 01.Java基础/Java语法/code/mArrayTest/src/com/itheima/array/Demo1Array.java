package com.itheima.array;

public class Demo1Array {
    /*
        数组的定义格式:

            1: 数据类型[] 数组名;
            2: 数据类型 数组名[];
     */
    public static void main(String[] args) {
        // 数据类型[] 数组名;
        // 定义了一个int类型的数组, 数组名叫arr

        /*
            这里虽然是定义了一个数组, 但也仅仅只是一个数组类型的[变量], 变量没有进行初始化, 就直接使用了, 这就是错误原因.
         */
        //int[] arr = 创建数组容器;
        //System.out.println(arr);

        // 定义了一个char类型的数组, 数组名叫cArr
        char[] cArr;
        //System.out.println(cArr);

        int a = 10;
        System.out.println(a);
    }
}
