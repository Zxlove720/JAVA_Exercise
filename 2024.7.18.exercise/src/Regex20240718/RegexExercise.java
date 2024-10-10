package Regex20240718;
public class RegexExercise {
    public static void main(String[] args) {
        String regex1 = "1[3-9]\\d{9}";
        // 1 表示手机号只能以1开头（第一位是1）
        // [3 - 9] 表示手机号第二位只能是3-9的数字
        // \\d{9} 表示任意数字恰好出现9次（11 - 2）
        System.out.println("15120344540".matches(regex1));
        System.out.println("151203440".matches(regex1));
        System.out.println("55120344540".matches(regex1));
    }
}
