package RegexExercise20240721;
import java.util.Scanner;
public class RegexExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1.要求字符串是小写辅音字符开头，后面纯字母，共六位
        /*System.out.println("请输入一个字符串");
        String testString = sc.nextLine();
        if (testString.matches("[a-z&&[^aeiou]][a-zA-Z]{5}")) {
            System.out.println("合法字符串");
        } else {
            System.out.println("非法字符串");
        }*/

        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        System.out.println("请输入一个字符串");
        String testString = sc.nextLine();
        if (testString.matches("[aeiou]ad")) {
            System.out.println("合法字符串");
        } else {
            System.out.println("非法字符串");
        }
    }
}
