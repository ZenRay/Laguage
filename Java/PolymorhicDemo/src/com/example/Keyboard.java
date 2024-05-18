package com.example;

public class Keyboard extends ExternelHardware implements USB{
    @Override
    public void open() {
        System.out.println("子类键盘设备接口方法实现: 接入");
    }

    @Override
    public void close() {
        System.out.println("子类键盘设备接口方法实现: 退出");
    }

    public void inputKeyboard(){
        System.out.println("子类键盘设备一般方法: 键盘输入");
    }
}
