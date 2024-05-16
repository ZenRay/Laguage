package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Test1";
        s1.age = 18;
//        s1.className = "111";

        Student s2 = new Student();
        s2.name = "Test2";
        s2.age = 19;
//        s2.className = "112";

        System.out.println("S1 <na  me>:" + s1.name + "<className>:" + s1.className + "\nS2 <name>:" + s2.name + "<className>:" + s2.className + "\n");
        Student.className = "124";
        System.out.println(Student.className);
        // 静态方法可以被调用，但是需要通过类名称调用
        Student.apply();
        // 可以通过对象调用静态方法
        s1.apply();
    }
}