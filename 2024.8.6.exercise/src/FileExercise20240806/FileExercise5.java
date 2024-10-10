package FileExercise20240806;

import java.io.File;

public class FileExercise5 {
    private static long size = 0;
    public static void main(String[] args) {
        File f1 = new File("D:\\Exercise");
        countSize(f1);
        int realSize = (int)(size / 1024 / 1024);
        System.out.println(f1.getName() + "的大小是" + realSize + "MB");
    }

    public static void countSize(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for(File f : files) {
                if (f.isFile()) {
                    size += f.length();
                } else if(f.isDirectory()) {
                    countSize(f);
                }
            }
        }
    }
}
