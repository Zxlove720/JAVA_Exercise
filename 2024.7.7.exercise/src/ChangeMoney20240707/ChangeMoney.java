package ChangeMoney20240707;
import java.util.Scanner;
public class ChangeMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();
        if (checkMoney(money)) {
            String strMoney = getMoney(money);
            strMoney = changeMoney(strMoney);
            System.out.println(strMoney);

        } else {
            System.out.println("金额不合法");
        }
    }
    public static boolean checkMoney(int money) {
        if (money < 0 || money > 99999999) {
            return false;
        }
        return true;
    }

    public static String getMoney(int money) {
        String strMoney = "";
        while (money > 0) {
            strMoney = (money % 10) + strMoney;
            money /= 10;
        }
        return strMoney;
    }

    public static String changeMoney(String strMoney) {
        char[] change = {'零', '壹' , '贰' , '叁', '肆', '伍', '陆', '柒', '捌', '玖'};
        String newStr = "";
        for (int i = 0; i < strMoney.length(); i++) {
            newStr = newStr + change[strMoney.charAt(i) - '0'];
        }
        int len = 8 - newStr.length();
        for (int i = 0; i < len; i++) {
            newStr = "零" + newStr;
        }
        String[] count = {"仟", "佰", "拾", "万", "仟", "佰", "拾", "元"};
        String returnStr = "";
        for (int i = 0; i < newStr.length(); i++) {
            returnStr = returnStr + (newStr.charAt(i) + count[i]);
        }
        return returnStr;
    }
}
