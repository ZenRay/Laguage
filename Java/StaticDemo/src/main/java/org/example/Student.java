package org.example;

/**
 * 静态成员示例
 * 1. 成员使用 static 关键字
 */
public class Student {
    String name;
    int age;
    static String className = "111";

    public static void apply(){
        System.out.println("选择课程名称: " + Student.className);
    }
}
