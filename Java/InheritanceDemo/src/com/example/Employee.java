package com.example;

public class Employee {
    String name;
    int age;
    public String sameVariable = "父类同名成员变量";

    public Employee() {
        System.out.println("父类 Employee 无参数构造方法");
    };

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类 Employee 有参数构造方法");
    }

    public void publicWork(){
        System.out.println("测试: 父类 一个 Public 方法");
    }

    // 子类对象可继承该 private 方法，但是不可以被调用
    private void privateWork(){
        System.out.println("测试: Employee 一个 Private 方法");
    }

    public void parentMethod(){
        System.out.println("测试: 是父类方法");
    }

    public void sameMethod(){
        System.out.println("测试: 父类中的同名方法");
    }
}
