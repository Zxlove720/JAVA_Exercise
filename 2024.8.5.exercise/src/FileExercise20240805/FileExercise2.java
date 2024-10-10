package FileExercise20240805;

import java.io.File;

public class FileExercise2 {
    public static void main(String[] args) {
        // File中常用的方法

        // String getAbsolutePath() 返回该File对象的绝对路径名字的字符串（绝对路径）
        File f1 = new File("C:\\Users\\24829\\Desktop\\zxl.txt");
        String absolutePath = f1.getAbsolutePath();
        System.out.println(absolutePath);

        // String getPath() 返回将此File对象转换为路径名字的字符串（构造路径）
        String path = f1.getPath();
        System.out.println(path);

        // String getName() 返回此File对象表示的文件或者目录的名称（带后缀）
        String fileName = f1.getName();
        System.out.println(fileName);

        // long length() 返回此File对象表示的文件的长度（大小），单位：字节(byte)
        // 细节：如果File对象表示的是目录，那么返回值未指定，想要统计目录的大小需要遍历求和目录中所有的文件
        long size = f1.length();
        System.out.println(size);


    }
}
