package com.nowcoder.part03;

import org.w3c.dom.ls.LSOutput;

public class ConversionDemo {
    public static void main(String[] args) {
        // 1.自动类型转换(小向大)
        char c = 'A';
        int i = c;
        System.out.println(i);

        long l = 100L;
        double d = l;
        System.out.println(d);

        // 2.强制类型转换
        int ii = 65;
        char cc = (char) ii;
        System.out.println(cc);

        double dd = 3.14;
        long ll = (long) dd;
        System.out.println(ll);

        // 3.运算时的自动类型转换
        // 1)先将byte,short,char转为int
        // 2)再将int转换为更大的类型
        char ccc = 'A';
        int iii = 100;
        double ddd = 3.14;
        System.out.println(ccc + iii + ddd);

        // 注意如下的坑
        byte b = 8;
        b = (byte) (b - 3);

        // 下列情况是默认规则,不是类型转换
        byte k = 5;
        short m = 6;
        char n = 7;
    }

}
