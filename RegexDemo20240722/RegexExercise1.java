package RegexDemo20240722;
import java.util.Scanner;
public class RegexExercise1 {
    public static void main(String[] args) {
        // 验证邮箱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电子邮箱");
        String email = sc.nextLine();
        if (email.matches("[\\w&&[^_]]\\w*@[\\w&&[^_]]{2,6}(.[a-zA-Z]{2,3}){1,2}")) {
            System.out.println("合法邮箱");
        } else {
            System.out.println("非法邮箱");
        }
    }
}
