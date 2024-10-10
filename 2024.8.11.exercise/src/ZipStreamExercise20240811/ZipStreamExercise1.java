package ZipStreamExercise20240811;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipStreamExercise1 {
    public static void main(String[] args) throws IOException {
        // 压缩（解压缩）流 ZipStream 可以压缩（解压缩）文件或压缩（解压缩）文件夹

        // ZipOutputStream 压缩流：根据OutputStream创建指定的压缩流对象

        // src表示需要压缩的源文件
        File src = new File("D:\\Exercise\\words.txt");
        // dest表示压缩后压缩包输出的位置
        File dest = new File("D:\\");
        toZip(src, dest);
    }

    public static void toZip(File src, File dest) throws IOException {
        // ZipOutputStream 压缩流
        // 构造方法：
        // ZipOutputStream(OutputStream out)
        // 创建ZipOutputStream，关联压缩流和压缩包
        ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(dest, "a.zip")));
        // 创建ZipEntry对象，表示压缩包中每一个文件和文件夹
        ZipEntry entry = new ZipEntry("aaa\\bbb\\words.txt");
        // 将ZipEntry对象放入压缩包
        zos.putNextEntry(entry);
        // 将src文件中的数据写入压缩包
        FileInputStream fis = new FileInputStream(src);
        int result;
        while ((result = fis.read()) != -1) {
            zos.write(result);
        }
        // 关闭zos流
        zos.closeEntry();
        zos.close();
    }
}
