package StringAndRegex20240722;
import java.util.Scanner;
public class StringRegexExercise2 {
    public static void main(String[] args) {
        // 正则表达式和String中的replaceAll结合使用
        // 大串中满足正则的都会替换
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.nextLine();
        // 空格替换
        String result = str.replaceAll(" ", " 空格 ");
        System.out.println(result);
    }
}
