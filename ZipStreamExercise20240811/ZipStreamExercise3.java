package ZipStreamExercise20240811;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipStreamExercise3 {
    public static void main(String[] args) throws IOException {
        // 1. 创建一个表示要解压的压缩包的 File 对象
        File src = new File("D:\\Exercise.zip");
        // 2. 创建一个表示解压目的地的 File 对象
        File dest = new File("D:\\Exercise");
        // 调用解压方法
        unzip(src, dest);
    }

    // 定义一个解压方法
    public static void unzip(File src, File dest) throws IOException {
        // 创建一个 ZipInputStream 来读取压缩包
        try (ZipInputStream zip = new ZipInputStream(new FileInputStream(src))) {
            ZipEntry entry;
            while ((entry = zip.getNextEntry()) != null) {
                System.out.println(entry);
                File file = new File(dest, entry.getName());
                if (entry.isDirectory()) {
                    // 在目的地创建目录
                    file.mkdirs();
                } else {
                    // 确保父目录已创建
                    new File(file.getParent()).mkdirs();
                    // 将文件写入目的地
                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zip.read(buffer)) != -1) {
                            fos.write(buffer, 0, len);
                        }
                    }
                }
                zip.closeEntry();
            }
        }
    }
}
