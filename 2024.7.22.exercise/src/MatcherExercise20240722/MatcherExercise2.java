package MatcherExercise20240722;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherExercise2 {
    public static void main(String[] args) {
        // 用Matcher类和Pattern方法将座机电话、邮箱、手机号、热线都爬取出来
        String str = "来黑马程序员学习Java，" +
                "电话:18512516758，18512508907" + "或者联系邮箱:boniu@itcast.cn，" +
                "座机电话:01036517895，010-98951256" + "邮箱:bozai@itcast.cn，" +
                "热线电话:400-618-9090 ，400-618-4000，4006184000，4006189090";
        Pattern rule = Pattern.compile("(1[3-9]\\d{9})|([\\w&&[^_]]\\w*@[\\w&&[^_]]{2,6}(.[a-zA-Z]{2,3}){1,2})" +
                "|(0\\d{2,3}-?[1-9]\\d{4,9})|(400-?[1-9]\\d{2}-?[1-9]\\d{3})");
        Matcher m = rule.matcher(str);
        while(m.find()) {
            String result = m.group();
            System.out.println(result);
        }
    }
}
