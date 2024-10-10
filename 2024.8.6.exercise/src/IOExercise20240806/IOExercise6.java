package IOExercise20240806;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOExercise6 {
    public static void main(String[] args) throws IOException {
        // 字符输出流 write
        // void write(int c) 写入单个字符（从内存到文件）
        // void write(char[] cbuf) 写入字符数组
        // void write(char[] cbuf, int off, int len) 写入字符数组的某一部分，从off索引开始，写入len个元素
        // void write(String str) 写入字符串
        // void write(String str, int off, int len) 写入字符串的一部分
        // void flush() 刷新该流的缓冲区（先是将内存中的数据写入到缓冲区，然后再从缓冲区一起写入文件，可以减少IO操作，提高效率）

        // FileWrite类
        // FileWrite是以字符的形式写出到文件的便利类，构造方法使用系统默认的字符编码和默认的字节缓冲区

        // FileWriter(File file) 用给定需要写入的File对象创建FileWriter对象
        File file1 = new File("D:\\Exercise\\words.txt");
        FileWriter fw1 = new FileWriter(file1);

        // FileWriter(String fileName) 用需要写入的文件路径创建FileWriter对象
        FileWriter fw2 = new FileWriter("D:\\Exercise\\words.txt");

        // write(int b) 每次写一个字符数据
        fw2.write(97);
        fw2.write('4'); // 此处有类型提升
        fw2.write('c');
        fw2.write(30000);
        // 注：此时只是将数据成功写入到了缓冲区中，并非直接写入了缓冲区

        // write方法完成之后，必须要用close方法或者flush方法，才可以将缓冲区内的数据真正的写入到对应的文件中
        // flush和close的区别
        // flush：刷新缓冲区，将缓冲区的数据写入到对应的文件中去，流对象仍然可以继续使用！
        // close：先刷新缓冲区，然后通知系统释放资源，流对象不可以继续使用！
        fw2.close();
        // 注意，flush≠close，所以说即使使用了flush，最后不用流了还是需要close

    }
}
