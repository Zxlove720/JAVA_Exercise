package GBKToUTFExercise20240808;

import java.io.*;

public class GBKToUTFExercise {
    public static void main(String[] args) throws IOException {
        // 将本地的GBK文件通过转换流读取并且转换编码为UTF-8

        // 获取本地的GBK文件
        FileInputStream fis = new FileInputStream("D:\\Exercise\\gbk.txt");
        // 获取字节转换输入流
        InputStreamReader isr = new InputStreamReader(fis, "GBK");
        // 获取想要保存的文件位置
        FileOutputStream fos = new FileOutputStream("D:\\Exercise\\UTF-8.txt");
        // 获取字符转换输出流
        OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); //UTF-8这个参数可以不屑，默认UTF-8
        // 循环读取其中内容
        int read;
        while ((read = isr.read()) != -1) {
            osw.write(read);
        }
        // 先开后关原则
        osw.close();
        isr.close();
    }
}
