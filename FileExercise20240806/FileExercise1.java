package FileExercise20240806;

import java.io.File;
import java.io.IOException;

public class FileExercise1 {
    public static void main(String[] args) throws IOException {
        // 先创建目录
        File file = new File("D:\\Exercise");
        System.out.println(file.mkdir());
        // 再根据父级目录创建子文件
        File file2 = new File(file, "aaa.txt");
        System.out.println(file2.createNewFile());
    }
}
