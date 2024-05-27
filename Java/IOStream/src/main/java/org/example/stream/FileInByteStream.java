package org.example.stream;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


/**
 * FileInputStream 读取文件字节流
 * 1. 一个流对象,读完之后,就不要再读了;除非重新new一个新的对象
 * 2. 流关闭之后,流对象不能继续使用了
 */
public class FileInByteStream {
    public static void main(String[] args) throws IOException {
        File file = new File("./data/test.txt");
        FileInputStream inputStream = new FileInputStream(file);

        // 直接读取每个字节数据
        while (inputStream.available() > 0) {
            System.out.println((char) inputStream.read());
        }
        inputStream.close();

        System.out.println("======第二次读取数据信息=====");
        // 第二中读取指定字节长度数据

       /*
           创建一个数组:byte[]
            1.创建的数组相当于一个临时存储区域,我们要读取的内容会临时保存到数组中
              然后我们再从数组中将数据获取
            2.数组长度定为多少,每次读取多少个,一般情况下数组长度定为1024或者1024的倍数
              如果剩下的字节不够数组长度了,那么就最后有多少读多少
         */
        inputStream = new FileInputStream(file);
        String temp;
        byte[] bytes = new byte[3];
        int len;
        while ((len = inputStream.read(bytes, 0, 3)) != -1) {
            System.out.println(new String(bytes) + ": " + bytes);
        }

        inputStream.close();
    }
}
