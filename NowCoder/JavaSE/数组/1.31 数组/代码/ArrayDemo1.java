package com.nowcoder.part09;

/*
 * 数组
 * */
public class ArrayDemo1 {

    public static void main(String[] args) {
        // 静态初始化
        int[] ownNums = {5, 10, 15, 20, 25, 30, 6};

        System.out.print(ownNums[0] + "\t");
        System.out.print(ownNums[1] + "\t");
        System.out.print(ownNums[2] + "\t");
        System.out.print(ownNums[3] + "\t");
        System.out.print(ownNums[4] + "\t");
        System.out.print(ownNums[5] + "\t");
        System.out.print(ownNums[6] + "\n");

        ownNums[ownNums.length - 1] = 8;
        System.out.println("last element: " + ownNums[ownNums.length - 1]);

        // 动态初始化
        int[] ranNums = new int[7];
        // 红色球 [1,33]
        for (int i = 0; i < 6; i++) {
            ranNums[i] = (int) (Math.random() * 33 + 1);
        }
        // 蓝色球 [1,16]
        ranNums[ranNums.length - 1] = (int) (Math.random() * 16 + 1);

        System.out.print(ranNums[0] + "\t");
        System.out.print(ranNums[1] + "\t");
        System.out.print(ranNums[2] + "\t");
        System.out.print(ranNums[3] + "\t");
        System.out.print(ranNums[4] + "\t");
        System.out.print(ranNums[5] + "\t");
        System.out.print(ranNums[6] + "\n");

        // 常见的错误
        System.out.println(ranNums[ranNums.length]);
    }

}
