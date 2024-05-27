package org.example.stream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符流专门操作文本文档的,但是复制操作不要用字符流,要用字节流
 */
public class FileInStream {
    public static void main(String[] args) throws IOException {
        File file = new File("./data/test.txt");
        FileReader reader = new FileReader(file);

        char[] chars = new char[2];
        int len;
        while((len = reader.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
        reader.close();

    }
}
