package org.example.file;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {

        System.out.println(
                "File package contain path separator: '" + File.pathSeparator +
                        "' file sperator: '" + File.separator + "'"
        );
        //
        File file = new File("./data/test.txt");
        System.out.println("File path: " + file.getAbsolutePath());
        System.out.println("File name: " + file.getName());
        // 相对路径
        System.out.println("File path: " + file.getPath());

        // 检查父目录是否存在
        File parentPath = new File(file.getParent());
        if(! parentPath.exists()){
            System.out.println("Parent path does not exist, create directory!");
            parentPath.mkdirs();
        }


        // 创建文件
        try {
            if (! file.exists()) {
                System.out.println("File dosen't exist, then create file");
                file.createNewFile();
            }else {
                System.out.println("File exist!");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
