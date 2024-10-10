package FileExercise20240806;

import java.io.File;

public class FileExercise4 {
    public static void main(String[] args) {
        /* 删除多级目录：因为delete方法只能删除空目录，所以说想要删除多级目录应该先删除目录中的内容
    然后再删除自己 */
        File f1 = new File("D:\\Exercise");
        String fileName = f1.getName();
        if (deleteFile(f1)) {
            System.out.println(fileName + "成功删除");
        } else {
            System.out.println("删除失败");
        }
    }

    public static boolean deleteFile(File file) {
        File[] files = file.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    System.out.println("删除的文件是:" + f.getName());
                    System.out.println(f.delete());
                } else if(f.isDirectory()) {
                    deleteFile(f);
                }
            }
        }
        System.out.println("删除的目录是:" + file.getName());
        return file.delete();
    }
}
