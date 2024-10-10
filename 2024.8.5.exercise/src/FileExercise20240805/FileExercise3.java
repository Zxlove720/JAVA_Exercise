package FileExercise20240805;

import java.io.File;

public class FileExercise3 {
    public static void main(String[] args) {
        // 绝对路径和相对路径
        // 绝对路径：从盘符开始的路径，是一个完整的路径；绝对路径可以从外部或内部访问，不受当前工作目录的影响。
        // 相对路径：相对于项目目录的路径，是一个便捷的简化路径，开发中常用；相对路径会随着当前工作目录的改变而变化。

        // 判断功能的方法
        // boolean exists() 此File表示的文件或目录是否实际存在
        File f1 = new File("C:\\Users\\24829\\Desktop\\zxl.txt");
        System.out.println(f1.exists()); // zxl.txt存在，true
        File f2 = new File("C:\\Users\\24829\\Desktop\\张三.txt");
        System.out.println(f2.exists()); // 张三.txt不存在，false
        System.out.println("--------------------------------------");

        // boolean isDirectory() 此File表示的是否是目录
        System.out.println(f1.isDirectory()); // f1表示的是文件，不是目录，返回false
        File f3 = new File("C:\\Users\\24829\\Desktop\\zxl");
        System.out.println(f3.isDirectory()); // f3表示的是目录，返回true
        System.out.println("--------------------------------------");

        // boolean isFile() 此File表示的是否是文件
        System.out.println(f1.isFile()); // f1表示的是文件，返回true
        System.out.println(f3.isFile()); // f3表示的是目录，不是文件，返回false

    }
}
