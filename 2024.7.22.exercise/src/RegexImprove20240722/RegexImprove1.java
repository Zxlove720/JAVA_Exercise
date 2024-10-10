package RegexImprove20240722;
import java.util.Scanner;
public class RegexImprove1 {
    public static void main(String[] args) {
        // 捕获分组()
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个字符串");
//        String str = sc.nextLine();
//        // 分组括号，()相当于一组，以左括号为分组的顺序，\1相当于把第一组的数据用来再匹配一次
//        if (str.matches("(.).+\\1")) {
//            System.out.println("合法字符串");
//        } else {
//            System.out.println("非法字符串");
//        }

        // 需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
//        System.out.println("请输入一个字符串");
//        String str = sc.nextLine();
//        if (str.matches("(.+).+\\1")) {
//            System.out.println("合法字符串");
//        } else {
//            System.out.println("非法字符串");
//        }

        // 需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        // 分组括号分组规则是看左括号，而不是一个完整的括号，看且仅看左括号
        // 所以说可以用(.)来代表第一个数据\\2其实是(.)而不是((.)\2*),((.)\2*)是\\1,相当于第一部分
        if (str.matches("((.)\\2*).+\\1")) {
            System.out.println("合法字符串");
        } else {
            System.out.println("非法字符串");
        }

    }
}
