package com.itheima.test;

public class Test1 {
    /*
        需求：已知两个整数变量a = 10，b = 20，使用程序实现这两个变量的数据交换
        最终输出a = 20，b = 10;


        思路：
        1. 定义一个三方变量temp，将a原本记录的值，交给temp记录 （a的值，不会丢了）
        2. 使用 a 变量记录 b 的值，（第一步交换完毕，b的值也丢不了了）
        3. 使用 b 变量记录 temp的值，也就是a原本的值 （交换完毕）
        4. 输出 a 和 b 变量即可
     */
    /*
        动态初始化格式：

            数据类型[][] 变量名 = new 数据类型[m][n];
            m表示这个二维数组，可以存放多少个一维数组
            n表示每一个一维数组，可以存放多少个元素
     */
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // 将a原本记录的值，交给temp记录 （a的值，不会丢了）
        int temp = a;
        // 用 a 变量记录 b 的值，（第一步交换完毕，b的值也丢不了了）
        a = b;
        // 使用 b 变量记录 temp的值，也就是a原本的值 （交换完毕）
        b = temp;

        // 输出 a 和 b 变量即可
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
}
