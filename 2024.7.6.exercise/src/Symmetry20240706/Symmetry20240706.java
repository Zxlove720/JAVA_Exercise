package Symmetry20240706;
import java.util.Scanner;
public class Symmetry20240706 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        boolean flag = symmetry(sb);
        if (flag) {
            System.out.println("是对称字符串");
        } else {
            System.out.println("不是对称字符串");
        }
    }

    public static boolean symmetry(StringBuilder sb) {
        String str = sb.toString();
        sb.reverse();
        String reverseStr = sb.toString();
        if (str.equals(reverseStr)) {
            return true;
        }
        else {
            return false;
        }
    }
}
