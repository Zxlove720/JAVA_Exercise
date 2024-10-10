package RegexExercise20240721;
import java.util.Scanner;
public class RegexExercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //练习:以字符串的形式打印一个双引号
        //在Java中\为转义字符
//        System.out.println("\"\""); // 只打""Java会认为你打了个空的字符串，所以说要用\"进行转义
//        System.out.println("\\"); // 同样，\会认为是一个转义字符，所以说要用\\来达到输出\的效果
        // 预定义字符
        // .表示任意一个字符
//        System.out.println("请输入一个字符串");
//        String str1 = sc.nextLine();
//        System.out.println(str1.matches(".{6}"));

        // /d表示[0-9]
        System.out.println("123456".matches("\\d{6}"));
        System.out.println("126".matches("\\d{6}")); // 位数不够
        System.out.println("1234aa".matches("\\d{6}")); // 不是纯数字
        System.out.println("-------------------------------------------");

        // /D表示[^0-9]
        System.out.println("123456".matches("\\D{6}")); // 不能出现数字
        System.out.println("abcdef".matches("\\D{6}"));
        System.out.println("abc132".matches("\\D{6}")); // 不能出现数字
        System.out.println("-------------------------------------------");

        // \s表示空白字符[\t\n\x0B\f\r]
        System.out.println(" \t".matches("\\s{2}")); // 大抵用得比较少
        System.out.println("-------------------------------------------");

        // \S表示非空白字符[^\s]
        System.out.println("123456".matches("\\S{6}")); // 无空白字符
        System.out.println("123 56".matches("\\S{6}")); // 有一个空白字符
        System.out.println("阿斯顿阿斯顿".matches("\\S{6}"));
        System.out.println("-------------------------------------------");

        // \w表示单词字符[a-zA-Z_0-9]
        System.out.println("123abc__".matches("\\w{8}"));
        System.out.println("123abc_$".matches("\\w{8}")); // 出现了非单词字符
        System.out.println("123abc_啊".matches("\\w{8}"));
        System.out.println("-------------------------------------------");

        // \W表示非单词字符[^\w]
        System.out.println("啊水水阿斯顿".matches("\\W{6}"));
        System.out.println("123阿斯顿".matches("\\W{6}")); // 出现了单词字符


    }
}
