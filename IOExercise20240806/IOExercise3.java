package IOExercise20240806;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExercise3 {
    public static void main(String[] args) throws IOException {
        // 追加数据
        // FileOut(in)putStream中每次创建文件输出（入）流都会清空文件中的内容，但是可以通过控制构造方法中的append来追加内容
        // FileOutputStream(File file, boolean append) // append默认是false，但是可以传入true表示追加，那么就不会清空文件
        File file1 = new File("D:\\Exercise\\words.txt");
        FileOutputStream fos1 = new FileOutputStream(file1, true); // 构造方法传入true，表示追加内容
        fos1.write("一二三四五六七八九十".getBytes()); // 文件中之前的内容没有被清空，将write的内容追加到了后面
        fos1.close();

        // FileOutputStream(String name, boolean append)
        FileOutputStream fos2 = new FileOutputStream("D:\\Exercise\\words.txt", true);
        fos2.write("张三李四王五".getBytes());
        fos2.close(); // 成功追加

        // 写出换行符
        // windows系统中换行符是\r\n，但是Java中只需要写\n或者\r都会在底层自动补充为\r\n，但是建议还是写全
        FileOutputStream fos3 = new FileOutputStream(file1);
        fos3.write("床前明月光，\r\n疑似地上霜。\n举头望明月，\r低头思故乡。".getBytes());
        // 显然\r\n换行成功，但是\r或者\n也可以实现换行，是因为Java中写\n或者\r都会在底层自动补充为\r\n，但是建议写全
        fos3.close();

        // 补充：
        // Windows中每行的结尾是回车+换行 \r\n
        // Linux中每行结尾只有换行 \n
        // Mac中每行结尾是回车 \r 从Mac OS X开始，与Linux统一
    }
}
