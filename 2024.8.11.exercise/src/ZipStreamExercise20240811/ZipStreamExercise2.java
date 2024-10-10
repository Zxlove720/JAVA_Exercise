package ZipStreamExercise20240811;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamExercise2 {
    public static void main(String[] args) throws IOException {
        // 压缩文件夹

        long startTime = System.currentTimeMillis();
        // 创建File对象表示需要压缩的文件夹
        File src = new File("D:\\Exercise");
        // 创建File对象表示压缩包应该输出到哪里
        File dest = new File("D:\\Exercise.zip");
        // 创建压缩流关联压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(dest));
        // 获取src中的每一个文件，变成ZipEntry对象，放入到压缩包中
        toZip(src, zos, src.getName());
        // 关闭ZipOutput流
        zos.close();
        long endTime = System.currentTimeMillis();
        System.out.println("一共用时" + ((endTime - startTime) / 1000) + "秒"); // 9 - 10s
    }

    public static void toZip(File src, ZipOutputStream zos, String name) throws IOException {
        // 得到src源文件中的所有文件和目录
        File[] files = src.listFiles();
        // 遍历所有文件
        for (File file : files) {
            // 判断是否为文件
            if (file.isFile()) {
                // 如果是文件，那么变成ZipEntry对象并放入压缩包中
                ZipEntry entry = new ZipEntry(name + "\\" + file.getName());
                // 放入压缩包中
                zos.putNextEntry(entry);
                // 读取文件的数据，写入压缩包
                FileInputStream fis = new FileInputStream(file);
                byte[] bytes = new byte[1024 * 1024 * 10];
                int len;
                while((len = fis.read(bytes)) != -1) {
                    zos.write(bytes, 0, len);
                }
                // 关闭文件输入流
                fis.close();
                zos.closeEntry();
            } else if (file.isDirectory()) {
                // 若是文件夹，则递归调用toZip方法
                toZip(file, zos, name + "\\" + file.getName());
                // 假如当前目录是src\\aaa
                // file = aaa   name = src\\aaa
                // name + "\\" + file.getName()的意思：
                // name表示父级文件夹的名字，+"\\"表示层级关系，file.getName可以得到当前文件夹的名字，组合起来才可以得到正确的层级关系的目录名
            }
        }
    }
}
