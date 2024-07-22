package RegexImprove20240722;
import java.util.Scanner;
public class ImproveExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        //  需求：需要把类似:我要学学编编编编程程程程程程替换为我要学编程
        // (.)是一个捕获组，可以匹配所有字符
        // \\1表示匹配前面的捕获组一次或多次 \\1是对第一个捕获组的引用
        // "(.)\\1+"：整体意思是匹配任何连续重复的字符
        // 当成功匹配到所有的连续重复的字符之后，会用$1在正则表达式之外引用第一组
        String result = str.replaceAll("(.)\\1+", "$1");
        System.out.println(result);
    }
}
