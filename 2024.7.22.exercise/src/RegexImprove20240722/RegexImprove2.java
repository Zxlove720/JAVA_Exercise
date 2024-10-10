package RegexImprove20240722;
import java.util.Scanner;
public class RegexImprove2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.nextLine();
        // 正则表达式可以用(?i)来忽略大小写，(?i)表示忽略后面的大小写
        if (str.matches("(?i)[a-z]+")) {
            System.out.println("合法字符串");
        } else {
            System.out.println("非法字符串");
        }
    }
}
