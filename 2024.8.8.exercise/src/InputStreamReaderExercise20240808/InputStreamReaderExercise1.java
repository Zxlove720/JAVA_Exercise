package InputStreamReaderExercise20240808;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExercise1 {
    public static void main(String[] args) throws IOException {
        // 编码与解码
        // 编码：计算机中存储的信息都是以二进制表示的，存储的时候，需要将数据按照某种规则转换为二进制再进行存储
        // 解码：将按照某种规则存储在计算机中的二进制数以同样的规则解析出来（成为可读的文件）

        // 简单理解：
        // 编码：字符（能看懂的文件） ————> 字节（存储在硬盘中的人类无法阅读的二进制文件）
        // 解码：字节（存储在硬盘中的人类无法阅读的二进制文件） ————> 字符（能看懂的文件）

        // 产生问题：假如以A规则对文件进行编码存储，再按照B规则对文件进行解码读取，则会产生乱码
        /* 常见问题：IDEA中的默认编码是UTF-8，而Windows中的默认编码是GBK，所以说用IDEA读取Windows系统中创建的文本文件时，若遇到
        中文（非英文的所有语言），则会产生乱码 */

        // 读取本地的GBK文件
//        FileReader fileReader = new FileReader("D:\\Exercise\\GBK.txt");
//        int result;
//        while ((result = fileReader.read()) != -1) {
//            System.out.println((char)result);
//        }
//        System.out.println("用UTF-8");
//        fileReader.close(); // 成功产生乱码

        // 转换流：其为Reader和Writer的子类

        // InputStreamReader（字节转换输入流），它是从字节流到字符流的桥梁，它可以读取字节，并且使用指定的字符集解码为字符
        // InputStreamReader(InputStream in) 创建一个使用默认字符集的字符转换输入流（IDEA默认的是UTF-8）
        // InputStreamReader(InputStream in, String charsetName) 创建一个指定字符编码的字符转换输入流

        // 现在读取本地的GBK文件
        FileInputStream fileReader = new FileInputStream("D:\\Exercise\\GBK.txt");
        //InputStreamReader isr = new InputStreamReader(fileReader, "GBK");
        InputStreamReader isr = new InputStreamReader(fileReader); // 假如按照默认的构造方法，编码方式是UTF-8，所以说读取出来还是乱码

        int result;
        while ((result = isr.read()) != -1) {
            System.out.println((char)result);
        }
        isr.close();
        // 按照GBK的解码方式成功读取本地的GBK文件

    }
}
