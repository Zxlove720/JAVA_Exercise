package RegexDemo20240722;
import java.util.Scanner;
public class RegexExercise4 {
    public static void main(String[] args) {
        // 验证身份证
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要验证的身份证号码");
        String id = sc.nextLine();
        // 但下面的正则表达式不能判断大小月和润平年
        if (id.matches("[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dxX]")) {
            System.out.println("合法身份证号");
        } else {
            System.out.println("非法身份证号");
        }
    }
}
