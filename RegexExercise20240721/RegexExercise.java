package RegexExercise20240721;
import java.util.Scanner;
public class RegexExercise {
    public static void main(String[] args) {
        // 正则表达式
        /* 假如现在要求校验一个qq号码是否正确。
            规则:6位及20位之内，0不能在开头，必须全部是数字。
            先使用目前所学知识完成校验需求然后体验一下正则表达式检验。
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个qq号");
        String qq = sc.nextLine();
        if (qq.matches("[1-9]\\d{5,19}")) {  // [1-9]表示第一个数字只能是1-9
            System.out.println("此qq号合法");      //  \\d表示是数组的预定义字符，{5,19}
        } else {                                  //  表示除了第一位，还有5-19位数字
            System.out.println("此qq号非法");
        }

    }
}
