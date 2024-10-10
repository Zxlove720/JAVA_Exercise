package Exercise20240723;
import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
//        需求：
//        自己实现parseInt方法的效果，将字符串形式的数据转成整数。
//        要求:字符串中只能是数字不能有其他字符最少一位，最多10位0不能开头
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        if (!str.matches("[1-9]\\d{0,9}")) {
            System.out.println("不合规的字符串");
            System.exit(1);
        }
        int number = 0;
        for (int i = 0; i < str.length(); i++) {
            number = number * 10 + (str.charAt(i) - '0');
        }
        System.out.println(number);
        System.out.println(number + 5);

    }
}
