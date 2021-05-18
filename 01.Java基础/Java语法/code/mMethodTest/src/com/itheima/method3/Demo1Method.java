package com.itheima.method3;

public class Demo1Method {
    /*
        带返回值方法的定义格式:
            public static 数据类型  方法名 ( 参数 ) {
                    return 数据 ;
            }

           方法定义时return后面的返回值与方法定义上的数据类型要匹配，否则程序将报错

        带返回值方法的调用格式:
           数据类型 变量名 = 方法名 ( 参数 ) ;

        需求: 定义一个方法, 计算两个整数相加的和
     */
    public static void main(String[] args) {
        int num = add(10,20);
        System.out.println(num);
    }

    public static int add(int a, int b){
        int c = a + b;
        return c;
    }
}
