package com.itheima.contrast;

public class Demo1Pop {
    /*
        需求: 遍历打印数组, 要求结果为[11, 22, 33, 44, 55]

        面向过程思想: 自己一步步的实现需求
     */
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
        // 1. 打印左括号
        System.out.print("[");
        // 2. 遍历数组获取每一个元素
        for (int i = 0; i < arr.length; i++) {
            // 3. 判断是否是最后一个元素
            if(i == arr.length - 1){
                // 4. 是最后一个元素特殊处理, 换行打印,拼接右括号
                System.out.println(arr[i] + "]");
            }else{
                // 5. 不是最后一个元素, 不换行, 拼接逗号空格
                System.out.print(arr[i] + ", ");
            }
        }

    }
}
