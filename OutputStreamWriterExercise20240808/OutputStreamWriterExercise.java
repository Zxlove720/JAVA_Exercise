package OutputStreamWriterExercise20240808;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterExercise {
    public static void main(String[] args) throws IOException {
        // OutputStreamWriter 字符转换输出流，是字符流到字节流的桥梁，使用指定的字符集将字符编码为字节
        // OutputStreamWriter(OutputStream out) 创建一个默认编码的字符转换输出流（UTF-8）
        // OutputStreamWriter(OutputStream out, String charsetName) 创建一个指定编码的字符转换输出流

        // 用UTF-8写入文件
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Exercise\\change.txt"));
        osw.write("以UTF-8写入");
        osw.close();

        // 用GBK写入文件
        OutputStreamWriter osw2 = new OutputStreamWriter(new FileOutputStream("D:\\Exercise\\change2.txt"), "GBK");
        osw2.write("以GBK写入");
        osw2.close();
    }
}
