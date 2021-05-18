package com.itheima.method4;

public class Demo1Method {
    public static void main(String[] args) {
        print(10,20);
    }

    public static void print(int n, int m){

        if(m < n){
            System.out.println("您传入的数据有误, 请检查");
            // return; 可以用于结束方法, 也就是将方法从栈内存中弹出去, 该过程称之为方法的弹栈
            return;
            // System.out.println();  无法执行的代码, 无效代码
            // 问题: return语句下面, 不是不能写代码吗?
        }
        System.out.println(n + "到" + m + "之间的奇数为:");
        for(int i = n; i <= m; i++){
            if(i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
