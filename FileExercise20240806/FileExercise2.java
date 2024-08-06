package FileExercise20240806;

import java.io.File;

public class FileExercise2 {
    public static void main(String[] args) {
        // 定义一个方法找某一个文件夹中，是否有以txt结尾的文本文件
        File file = new File("D:\\Exercise"); // 创建一个文件对象表示Exercise目录
        boolean flag = findTxt(file);
        if (flag) {
            System.out.println(file.getAbsolutePath() + "目录中有.txt的文本文件");
        }
    }

    public static boolean findTxt(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            String fileName = f.getName();
            if (fileName.endsWith(".txt")) {
                return true;
            }
        }
        return false;
    }
}
