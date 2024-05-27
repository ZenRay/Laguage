package org.example.stream;


import java.io.FileOutputStream;
import java.io.IOException;


/**
 * 文件输出 IO 流是将数据写入文件中
 */
public class FileOutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream = new FileOutputStream("./data/test.txt");


        // FileOutputStream 只能写入字节数据
        outputStream.write(98);
        outputStream.write("\n".getBytes());
        outputStream.write("hello World\n".getBytes(), 2, 7);
        outputStream.write("您好\n，这个是是一个测试数据".getBytes());

        outputStream.close();


    }
}
