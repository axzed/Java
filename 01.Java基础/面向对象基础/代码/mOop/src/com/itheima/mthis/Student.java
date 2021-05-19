package com.itheima.mthis;

public class Student {
    private String name;

    public void setName(String name){
        System.out.println("[方法中打印this]");
        System.out.println(this);
        this.name = name;
    }
}
