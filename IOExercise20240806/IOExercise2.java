package IOExercise20240806;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExercise2 {
    public static void main(String[] args) throws IOException {
        // 字节流write(byte[] b) 每次可以向表示的文件中写出byte数组中的数据
        File file1 = new File("D:\\Exercise\\words.txt");
        byte[] bytes = {97,98,99,100,101};
        FileOutputStream fos1 = new FileOutputStream(file1);
        fos1.write(bytes); // 传递byte数组进行写入成功
        // 可以通过String中的getBytes方法简洁地将字符串转化为byte数组，从而写入
        fos1.write("你好世界".getBytes()); // 可以写中文

        // write(byte[] b, int off, int len) 每次写入byte数组中从off索引开始，长度为len的字节数据
        fos1.write("hello world".getBytes(), 2, 5); // 写hello world中从2索引开始，长度为5的数据"llo w"
        fos1.close(); // close之后再想使用这个流就会报错！close必须再不用流之后写

    }
}
