package com.example;

public class Teacher extends Employee{
    // 子类的成员
    String occupation;
    public String sameVariable = "子类同名成员变量";

    public void childMethod(){
        System.out.println("这个是一个子类方法");
    }


    public void sameMethod() {
        System.out.println("子类中同名方法");
    }
}
