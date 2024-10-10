package Exercise20240721;
import java.util.Scanner;
public class CheckPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //请编写正则表达式验证用户输入的手机号码是否满足要求。
        System.out.println("请输入手机号");
        String phoneNumber = sc.nextLine();
        // 手机号第一位只能是1，第二位只能是3-9的数字，后九位可以是任意数字
        if (phoneNumber.matches("1[3-9]\\d{9}")) {
            System.out.println("合法手机号");
        } else {
            System.out.println("非法手机号");
        }
    }
}
