package RegexDemo20240722;
import java.util.Scanner;
public class RegexExercise2 {
    public static void main(String[] args) {
        // 验证座机号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入座机号码");
        String phoneNumber = sc.nextLine();
        if (phoneNumber.matches("0\\d{2,3}-?[1-9]\\d{4,9}")) {
            System.out.println("合法座机号码");
        } else {
            System.out.println("非法座机号码");
        }
    }
}
