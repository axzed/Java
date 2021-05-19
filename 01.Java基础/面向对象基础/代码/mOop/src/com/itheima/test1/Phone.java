package com.itheima.test1;

public class Phone {
    // 品牌, 价格
    String brand;
    int price;

    // 打电话, 发短信
    public void call(String name){
        System.out.println("给"+name+"打电话");
    }

    public void sendMessage(){
        System.out.println("群发短信");
    }
}
