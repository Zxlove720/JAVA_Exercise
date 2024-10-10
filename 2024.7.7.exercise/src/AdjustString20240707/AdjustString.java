package AdjustString20240707;
import java.util.Scanner;
public class AdjustString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str1 = sc.nextLine();
        System.out.println("请输入第二个字符串");
        String str2 = sc.nextLine();
        if (adjustString(str1, str2)) {
            System.out.println("字符串可以调整");
        } else {
            System.out.println("字符串无法调整");
        }

    }

    public static boolean adjustString(String str1, String str2) {
        String temp = "";
        int len = str1.length();
        for (int i = 0; i < len; i++) {
            temp = temp + str1.charAt(0);
            str1 = str1.substring(1);
            str1 = str1 + temp;
            if (str2.equals(str1)) {
                return true;
            }
        }
        return false;
    }
}
