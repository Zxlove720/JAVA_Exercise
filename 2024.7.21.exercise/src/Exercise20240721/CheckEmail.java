package Exercise20240721;
import java.util.Scanner;
public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱号");
        String email = sc.nextLine();
        if (email.matches("[\\w&&[^_]]\\w*@[\\w&&[^_]]{2,6}(.[a-zA-Z]{2,3}){1,2}")) {
            System.out.println("合法邮箱");
        } else {
            System.out.println("非法邮箱");
        }
    }
}
