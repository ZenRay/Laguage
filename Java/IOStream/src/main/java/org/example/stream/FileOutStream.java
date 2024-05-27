package org.example.stream;

import java.io.FileWriter;
import java.io.IOException;

/**
 * flush():将缓冲区中的数据刷到文件中,后续流对象还能继续使用
 * close():先刷新后关闭,后续流对象不能使用了
 */
public class FileOutStream {
    public static void main(String[] args)  {

        FileWriter writer = null;
        try{
            writer = new FileWriter("./data/test.txt");
            writer.write("千山鸟飞绝\r\n");
            writer.write("万径人踪灭\r\n");
            writer.write("孤舟蓑笠翁\r\n");
            writer.write("独钓寒江雪\r\n");

            writer.flush();
            System.out.println("Flush data done");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            // 通过判断 writer 是否为 null 来确定是否需要close
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /**
         * JDK7之后io异常处理方式
         * 1.格式:
         *   try(IO对象){
         *       可能出现异常的代码
         *   }catch(异常类型 对象名){
         *       处理异常
         *   }
         * 2.注意:
         *   以上格式处理IO异常,会自动关流
         */
        try(FileWriter wr = new FileWriter("./data/test2.txt");){
            wr.write("千山鸟飞绝\r\n");
            wr.write("万径人踪灭\r\n");
            wr.write("孤舟蓑笠翁\r\n");
            wr.write("独钓寒江雪\r\n");
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
