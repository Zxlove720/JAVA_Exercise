package IOExercise20240806;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExercise1 {
    public static void main(String[] args) throws IOException {
        // IO流(input   output) 输入流和输出流————>流向内存是输入流，流出内存是输出流
        // Java中的IO操作主要是用java.io包下的内容，进行输入、输出操作；输入叫读取数据、输出叫写出数据
        // IO流主要分为输入流和输出流（流向内存是输入流，流出内存是输出流）

        // 根据数据的类型也可以分为字节流和字符流

        // 字节流：以字节为单位读取数据
        // 字符流：以字符为单位读取数据



        // 字节流（顶级父类）
        // 字节输入流：InputStream     字节输出流：OutputStream
        // 计算机的底层存储是以二进制的形式进行的，所以说字节流可以传输任意的文件数据

        // 常用子类：FileOutputStream，顾名思义，是文件的输出流，可以将内存中的数据输出到File对象所表示的文件中
        // 构造方法
        // FileOutputStream(File file) 用指定的File对象创建文件输出流
        File file1 = new File("D:\\Exercise\\庄小琳.txt");
        FileOutputStream fos1 = new FileOutputStream(file1);
        // 这里会产生FileNotFoundException异常，需要throws到方法签名处

        // FileOutputStream(String name)
        FileOutputStream fos2 = new FileOutputStream("D:\\Exercise\\庄小琳.txt"); // 其中参数是路径和文件名
        // 当创建流对象时，必须传入文件路径，如该路径下没有这个文件，那么会创建该文件，如果有这个文件，则会清空这个文件

        // 写出字节
        // write(int b) 写出一个字节数据到FileOutputStream表示的文件中
        fos2.write("hello world".getBytes()); // 产生IOException，需要throws

        // 使用完流之后，不再使用了必须使用close方法停止对文件的占用
        fos1.close();
        fos2.close();
    }
}
