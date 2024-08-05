package FileExercise20240805;

import java.io.File;
import java.io.IOException;

public class FileExercise4 {
    public static void main(String[] args) throws IOException {
        // boolean creatNewFile() 当且仅当具有该名称的文件尚不存在时，创建一个新的空文件
        File f = new File("C:\\Users\\24829\\Desktop\\zxl.txt");
        System.out.println(f.getAbsolutePath());
        System.out.println("--------------------------");
        File f2 = new File("C:\\Users\\24829\\Desktop\\张三.txt");
        System.out.println(f2.createNewFile());
        // f2所表示的路径下不存在张三.txt这个文件，createNewFile方法成功创建新文件，返回true
        System.out.println(f2.getName());
        System.out.println("--------------------------");
        // f3所表示路径下已经存在zxl.txt这个文件，createNewFile文件没有再次创建文件，返回false
        System.out.println(f.createNewFile());
        System.out.println("--------------------------");

        // boolean delete() 删除由此File对象表示的文件或者目录（跳过回收站，直接删除）
        // 细节：delete在删除目录时，只能删除空目录
        System.out.println(f2.delete());
        // f2表示的文件是张三.txt，所以说delete方法成功执行，删除了张三.txt，返回true
        File f3 = new File("C:\\Users\\24829\\Desktop\\王五.txt");
        System.out.println(f3.delete()); // f3表示的文件不存在，所以说无法删除，返回false

    }
}
