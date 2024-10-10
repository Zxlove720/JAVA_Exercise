package IOExercise20240806;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class IOExercise5 {
    public static void main(String[] args) throws IOException {
        // 字符流
        /* 当用字节流读取文本文件时，遇到问题————遇到中文字符时，根据编码规则不同，占用不同的字节数，假如用字节流读取
        会导致中文读取不全，从而产生乱码，所以说Java提供字符流类，专门处理文本文件 */

        // 字符输入流Reader，字符输出流Writer
        // FileReader类 此类是读取字符文件的便利类，构造时使用系统默认的字符编码和默认的字符缓冲区
        // 注：1.字符编码：字节和字符的对应规则，Windows中中文默认编码是GBK（中文2字节），idea中是UTF-8（中文3字节）
        //     2.字节缓冲区，一个字节数组，用来临时存储字节数据，是先从文件中读取数据到缓冲区中，然后再从缓冲区中读取到内存中

        // 创建一个流对象时，必须传入一个正确的文件路径
        // FileReader(File file) 用要读取的File对象创建FileReader对象
        File file1 = new File("D:\\Exercise\\words.txt");
        FileReader fr1 = new FileReader(file1);

        // FileReader(String name) 用要读取的文件的文件路径创建FileReader对象
        FileReader fr2 = new FileReader("D:\\Exercise\\words.txt");

        // read() 每次读取一个字符的数据，提升为int类型，并且返回，读到文件末尾返回-1
        int result;
        while ((result = fr2.read()) != -1) {
            System.out.print((char)result); // 根据字符读取，就可以正确的读取到中文了
        }
        // 注意：此处的fr2已经读到了文件末尾了，如果在下面的代码再次用fr2阅读文件则不会读到任何东西！！！

        // 细节，中文的标点符号就相当于中文字符，也会根据不同的编码规则占用不同的字节

        // read(char[] cbuf) 每次读取cbuf数组长度的字符到数组中，返回读取到的有效字符的个数，读取到文件末尾返回-1
        int len; // 表示读取到的有效长度
        char[] charArray = new char[3];
        while ((len = fr1.read(charArray)) != -1) {
            System.out.println(new String(charArray, 0, len)); // 改良后的写法，只会输出有效的读取
        }
    }
}
