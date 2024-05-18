package com.example;

public class Mouse extends ExternelHardware implements USB{
    @Override
    public void open() {
        System.out.println("子类鼠标设备接口方法实现: 接入");
    }

    @Override
    public void close() {
        System.out.println("子类鼠标设备接口方法实现: 退出");
    }

    public void clickMouse(){
        System.out.println("子类鼠标设备一般方法: 点击鼠标");
    }
}
