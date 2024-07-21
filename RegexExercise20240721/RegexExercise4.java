package RegexExercise20240721;
import java.util.Scanner;
public class RegexExercise4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 正则表达式的数量词
        // 必须是数字 字母 下划线 至少6位
        System.out.println("123456789".matches("\\w{6,}")); // {6,}表示至少六位
        System.out.println("123456789".matches("\\w{6}"));  // {6} 表示刚好六位
        System.out.println("-----------------------------------------");
        // 因为{,}是一个范围，所以说{6,}的范围就是6到正无穷，所以说是至少六位

        // 必须是数字和字符 必须是4位
        System.out.println("1234".matches("[a-zA-Z_0-9]{4}"));
        System.out.println("abcd".matches("[\\w&&[^_]]{4}"));
        System.out.println("abd".matches("[\\w&&[^_]]{4}")); // 位数不够
        System.out.println("a_2d".matches("\\w{4}"));
        System.out.println("-----------------------------------------");

        // 出现0次或1次----> x?
        System.out.println("123456a".matches("\\d{6}\\w?")); // \w出现了一次
        System.out.println("123456".matches("\\d{6}\\w?"));  // \w没有出现
        System.out.println("123456ab".matches("\\d{6}\\w?"));// \w出现了两次->false
        System.out.println("-----------------------------------------");

        // 出现0次到多次----> x*
        System.out.println("123456abc".matches("\\d{6}\\w*")); // \w出现了多次
        System.out.println("123456".matches("\\d{6}\\w*"));    // \w出现了0次
        System.out.println("123456a".matches("\\d{6}\\w*"));   // \w出现了1次
        System.out.println("-----------------------------------------");

        // 出现1次到多次----> x+
        System.out.println("123456abc".matches("\\d{6}\\w+"));
        System.out.println("123456".matches("\\d{6}\\w+")); // \w没有出现->false
        System.out.println("123456a".matches("\\d{6}\\w+"));
        System.out.println("-----------------------------------------");
    }
}
