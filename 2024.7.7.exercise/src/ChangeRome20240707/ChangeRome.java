package ChangeRome20240707;
import java.util.Scanner;
public class ChangeRome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        String number = sc.nextLine();
        if (checkNumber(number)) {
            number = changeNumber(number);
            System.out.println(number);
        } else {
            System.out.println("数字输入不合法");
        }

    }

    public static boolean checkNumber(String number){
        if (number.length() > 9) {
            return false;
        } else {
            for (int i = 0; i < number.length(); i++) {
                if (number.charAt(i) > '9' || number.charAt(i) < '0') {
                    return false;
                }
            }
            return true;
        }
    }

    public static String changeNumber(String number) {
        String[] rome = {"", "I,", "II,", "III,", "IV,", "V,", "VI,",
                "VII,", "VIII,", "IX,"};
        String romeStr = "";
        for (int i = 0; i < number.length(); i++) {
            romeStr = romeStr + rome[number.charAt(i) - '0'];
        }
        return romeStr;
    }

}
