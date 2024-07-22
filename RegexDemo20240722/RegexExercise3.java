package RegexDemo20240722;
import java.util.Scanner;
public class RegexExercise3 {
    public static void main(String[] args) {
        // 24小时制
        Scanner sc = new Scanner(System.in);
        // 23:11:11
        System.out.println("请输入一个时间");
        String time = sc.nextLine();
        /* 24小时制没有24极其以上的时，所以两种情况，01开头的时候，后面可以是任何数字
           而当2开头时，后面的数字只能是0-3，从而不会出现或超过24时 */
        if (time.matches("([01]\\d|2[0-3])(:[0-5]\\d){2}")) {
            System.out.println("合法的24小时制");
        } else {
            System.out.println("非法的24小时制");
        }
    }
}
