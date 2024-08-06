package IOExercise20240806;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IOExercise4 {
    public static void main(String[] args) throws IOException {
        // 字节输入流
        // InputStream 读取字节信息到内存中

        // FileInputStream(File file) 通过一个File对象创建FileInputStream，该文件由文件系统中的File对象命名
        File file1 = new File("D:\\Exercise\\words.txt");
        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream("D:\\Exercise\\words.txt");

        // int read() 读取流中的下一个字节提升为int类型并返回，读取到文件末尾之后，返回-1
        int b;
        while((b = fis1.read()) != -1) {
            System.out.print((char)b);
        }
        fis1.close();
        fis2.close();
        /* 细节：为什么一定要用一个变量接收read方法的返回值？
           read方法有一个指针指向文件的开始，每次调用都是返回对应的值然后后移指针，假如只用fis.read的返回值
           和-1比较的话，那么在循环内无法使用返回值对其进行操作，想要操作再次调用read方法，会导致指针再次后移
           从而导致一些文件中的数据被跳过了 */

        // read(byte[] b) 每次读取byte数组的长度个字节，读取到byte数组中，返回读取到的有效字节的个数，读到末尾返回-1
        byte[] bytes = new byte[2]; // 每次可以读2个字节到byte数组中
        FileInputStream fis3 = new FileInputStream("D:\\Exercise\\words.txt");
        int len; // 定义变量len，代表每次读取的有效个数
        while((len = fis3.read(bytes)) != -1) {
            System.out.println(new String(bytes));
            // 这样输出有bug，假如最后一次读取只读了一个有效数据，但是bytes中原来1索引还有数据，这样输出会导致重复输出
            System.out.println(new String(bytes, 0, len));
            // 改成这样输出，只会输出到0索引到len（读取的有效个数）索引的数据，避免了最后一次读取的重复输出
        }

        // 使用数组读取，每次读取多个字节，减少了系统间的IO操作次数（IO操作费时），从而提高了读写的效率，建议开发中使用。
    }
}
