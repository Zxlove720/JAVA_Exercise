package FileExercise20240805;

import java.io.File;

public class FileExercise1 {
    public static void main(String[] args) {
        // File类————> 来自java.io.File，是文件和目录路径名的抽象表示，主要可以用于对于文件和目录的创建、查找、删除等操作

        // File(String pathName) 通过路径名字的字符串来创建新的File实例（相当于这个File对象就链接了该路径的文件并可以对其操作）
        File f1 = new File("C:\\Users\\24829\\Desktop\\zxl.txt");

        // File(String parent, String child) 通过父级路径字符串和子级路径字符串创建File实例
        String parent = "C:\\Users\\24829\\Desktop";
        String child = "zxl.txt";
        File f2 = new File(parent, child);   // 父级路径和子级路径在构造方法会拼接成完整的路径（会拼接上\\）

        // File(File parent, String child) 通过父级抽象路径（父级的File对象）和子级路径创建File实例
        File f3 = new File("C:\\Users\\24829\\Desktop");
        File f4 = new File(f3, child);


        // 细节：
        // 1.一个File对象代表硬盘中实际存在的一个文件或者目录
        /* 2.无论该路径下（父级路径必须保证正确）是否存在文件或者目录，不影响File的创建
        创建File对象时不会马上在硬盘中创建文件，而是在真正要对File对象操作时，才会在硬盘中创建文件 */

    }
}
