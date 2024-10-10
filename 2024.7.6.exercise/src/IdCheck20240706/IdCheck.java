package IdCheck20240706;
import java.util.Scanner;
public class IdCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的身份证号");
        String IdCard = sc.nextLine();
        //500104200410141611
        boolean flag = check(IdCard);
        if (flag) {
            System.out.println("合法");
        } else {
            System.out.println("非法");
        }
    }

    public static boolean check(String IdCard){
        int len = IdCard.length();
        if (len != 18) {
            return false;
        } else {
            if (IdCard.charAt(0) > '9' || IdCard.charAt(0) < '1') {
                return false;
            }
            for (int i = 1; i < IdCard.length() - 1; i++) {
                if (IdCard.charAt(i) > '9' || IdCard.charAt(i) < '0') {
                    return false;
                }
            }
            if (IdCard.charAt(17) != 'X') {
                if (IdCard.charAt(17) < '0' || IdCard.charAt(17) > '9') {
                    return false;
                }
            }
        }
        return true;
    }
}
