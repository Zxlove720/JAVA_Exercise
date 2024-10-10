package MatcherExercise20240722;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherExercise4 {
    public static void main(String[] args) {
        /*
        只写+和*表示贪婪匹配
                +? 非贪婪匹配 本来+是指出现1或多次，但是加上？非贪婪获取，那么后面的只会出现1次
                *? 非贪婪匹配 本来*是指出现0或多次，但是加上？非贪婪获取，那么后面的不会出现
        贪婪爬取:在爬取数据的时候尽可能的多获取数据
        非贪婪爬取:在爬取数据的时候尽可能的少获取数据
        ab+:
        贪婪爬取:abbbbbbbbbbbb
        非贪婪爬取:ab
        */
        // 大抵意思是在+或者*后面加？就可以非贪婪匹配，Java默认是贪婪匹配
        String str = "aaabbbccc";
        Pattern rule = Pattern.compile("a+?b+?c+?");
        Matcher m = rule.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
