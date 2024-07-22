package RegexImprove20240722;
import java.util.Scanner;
public class RegexImprove3 {
    public static void main(String[] args) {
        // 非捕获分组
        Scanner sc = new Scanner(System.in);
//        String regex = "[1-9]\\d{16}(?:\\d|x|x)\\1";
//        System.out.println("请输入身份证号");
//        String id = sc.nextLine();
//        System.out.println(id.matches(regex)); // regex中\\1报错了，因为(?:)不是捕获分组，所以说不存在第一组
        String rightRegex = "[1-9]\\d{16}[\\dxX]";
        System.out.println("请输入身份证号");
        String id = sc.nextLine();
        System.out.println(id.matches(rightRegex));

    }
}
