package FileExercise20240805;

import java.io.File;

public class FileExercise5 {
    public static void main(String[] args) {
        // 目录操作
        // boolean mkdir() 创建由此File表示的目录（父目录必须存在，相当于不能创建多级目录）
        File f1 = new File("D:\\zxl");
        // 细节：必须要在指定位置具有创建目录的权限才可以创建文件夹，在桌面不具备创建目录的权限
        System.out.println(f1.mkdir()); // D盘中创建目录成功，返回true
        System.out.println(f1.isDirectory()); // 确实是创建了一个目录
        System.out.println(f1.length());
        System.out.println("-----------------------------------");
        File f2 = new File("D:\\zxl");
        System.out.println(f2.mkdir()); // zxl已经存在这个目录了，所以说创建失败
        //System.out.println(f2.delete()); // f2也表示的D:\zxl这个目录，所以说也可以删除成功，返回true
        //System.out.println(f1.delete()); // f2已经将zxl删除了，所以说f1再删就无法找到该目录了，所以说删除失败
        System.out.println("-----------------------------------");

        // mkdir无法创建多级目录
        // boolean mkdirs() 创建多级目录，因为它包括了必要的父目录不存在的目录
        File f3 = new File("D:\\zxl\\ZXL\\zxl\\zxl");
        System.out.println(f3.mkdir()); // 创建多级目录失败，mkdir只能创建必要父目录存在的目录
        System.out.println(f3.mkdirs()); // 创建多级目录成功，mkdirs可以创建多级目录，因为它包括了必要的父目录不存在的目录
    }
}
