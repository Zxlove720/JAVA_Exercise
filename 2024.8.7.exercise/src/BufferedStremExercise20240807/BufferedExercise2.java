package BufferedStremExercise20240807;

import java.io.*;

public class BufferedExercise2 {
    public static void main(String[] args) throws IOException {
        // 字符缓冲流
        // 因为字符流本身就自带了缓冲区，所以说字符缓冲流的效率提升并没有那么明显，但其中有特有的实用方法

        // BufferedReader(Reader in) 字符输入缓冲流
        // BufferedWriter(Writer out) 字符缓冲输出流

        // String readLine() 读取一行文字，读取到末尾返回null
        BufferedReader bf1 = new BufferedReader(new FileReader("D:\\Exercise\\words.txt"));
        BufferedWriter bw1 = new BufferedWriter(new FileWriter("D:\\Exercise\\copy.txt"));
        //bw1.write(bf1.readLine()); // 成功读取并写入一行
        // 循环读取
        String line;
        while ((line = bf1.readLine()) != null) { // 循环读取文件并写入文件成功（复制文件成功）
            System.out.println(line);
            bw1.write(line + "\r\n");
        }

        // newLine() 顾名思义，换行，写一行行分隔符，由系统属性定义符号（Windows  \r\n）
        bw1.newLine();
        bw1.newLine();
        bw1.write("newLine之后");
        // 成功换行

        bf1.close();
        bw1.close();
    }
}
