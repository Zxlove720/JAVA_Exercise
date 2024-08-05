package FileExercise20240805;

import java.io.File;
import java.io.IOException;

public class FileExercise6 {
    public static void main(String[] args) throws IOException {
        // 目录的遍历
        // String[] list() 返回一个String数组，表示该File目录下所有的子文件和目录
        File f1 = new File("D:\\zxl");


        String[] fileName = f1.list();
        for (String file : fileName) {
            System.out.println(file);
        }
        System.out.println("---------------------------");

        // File[] listFile() 返回一个File数组，表示该File目录中的所有子文件和目录
        // 相当于获取了里面所有子文件和子目录的File对象，便于操作
        File[] files = f1.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
            System.out.println(file.isFile());
            System.out.println("-----------");
        }

        // 细节：调用listFiles方法的File对象，必须是实际存在的目录，否则返回null
        File f3 = new File("D:\\123");
        // D盘下没有123这个目录，所以说调用listFiles返回null，强行调用，产生NullPointerException
        File[] files1 = f3.listFiles();
        for (File file : files1) {
            System.out.println(file.getName());
        }




    }
}
