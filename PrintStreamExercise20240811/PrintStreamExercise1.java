package PrintStreamExercise20240811;

import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamExercise1 {
    public static void main(String[] args) throws IOException {
        // 打印流 PrintStream
        // 在控制台的输出语句，大量使用了打印流中的方法，这些方法来自于java.io.PrintStream类，该类能够方便打印出各类型数据，是一种便捷的输出方式
        // 构造方法
        // PrintStream(String fileName) 用指定的文件名创建一个新的打印流
        PrintStream ps = new PrintStream("D:\\Exercise\\words.txt");

        // System.out就是PrintStream类型的，其流向是系统指定的，打印在控制台上
        System.out.println(97); // 成功在控制台打印出97
        // 注：打印流打印数据，数据是什么就打印什么，如97，则只会打印97，而不是a

        // 改变打印流向
        // 既然打印流是流，那么就可以改变其流向
        System .setOut(ps); // 用setOut方法改变输出的位置
        System.out.println(97); // 相当于在ps所对应的文件中打印97，而不是控制台
    }
}
