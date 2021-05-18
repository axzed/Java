package com.itheima.method2;

public class Demo2Method {
    /*
        需求：设计一个方法（print） 用于打印 n 到 m 之间所有的奇数

        思路：
        1：定义方法，名称为print
        2：为方法添加两个int类型的形参，准备接受调用者传递过来的实参
        3：方法中设计for循环，循环从n开始，到m结束
        4：循环中加入if判断，是奇数，则打印
        5：main方法中调用print方法，传入两个实际参数

     */
    public static void main(String[] args) {
        // 5：main方法中调用print方法，传入两个实际参数
        print(20,10);
    }

    //1：定义方法，名称为print
    // 2：为方法添加两个int类型的形参，准备接受调用者传递过来的实参
    public static void print(int n, int m){
        System.out.println(n + "到" + m + "之间的奇数为:");
        // 3：方法中设计for循环，循环从n开始，到m结束
        for(int i = 20; i <= 10; i++){
            // 4：循环中加入if判断，是奇数，则打印
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }

}
