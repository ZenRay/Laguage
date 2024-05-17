import com.example.Employee;
import com.example.Teacher;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         * 子类继承特点
         */
        Teacher teacher = new Teacher();
        Employee employee = new Employee();
        Employee fakeEmployee = new Teacher();

        // Teacher 继承 Employee 的非私有成员，且是可以调用的
        System.out.print("本测试实例是子类，声明也是子类的结果: ");
        teacher.publicWork();

        // Teacher 继承 Employee 的私有成员，但是不可以调用即下面的调用会失败
        // teacher.privateWork();

        // Employee 的 private 方法不可用，是因为 private 声明后权限的问题。下面的方法也不可调用
        // employee.privateWork();

        System.out.println("声明 Teacher 的同名成员变量: " + teacher.sameVariable);
        System.out.println("声明 Employee 的同名成员变量: " + employee.sameVariable);
        System.out.println("本测试实例是子类，声明是父类的同名成员变量结果: " + fakeEmployee.sameVariable);

        /**
         * 继承的方法上，由实例的对象决定
         */
        System.out.print("本测试实例是子类，声明是父类的同名成员方法结果: ");
        fakeEmployee.sameMethod();

    }
}