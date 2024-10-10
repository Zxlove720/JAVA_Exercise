package MatcherExercise20240722;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExercise1 {
    public static void main(String[] args) {
        // Pattern表示正则表达式
        // Matcher是文本匹配器，按照正则表达式去从一个大串中爬取符合Pattern规则的小串

        // 从下面的大串中爬取所有的JavaXX
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和" +
                "Java11,因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        // 首先创建规则(获取正则表达式的对象)
        Pattern rule = Pattern.compile("Java\\d{0,2}");
        // 创建文本匹配器的对象
        Matcher m = rule.matcher(str);
        // 利用循环获取
        //拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        //如果没有，方法返回false
        //如果有，返回true。在底层记录子串的起始索引和结束索引+1，相当于每次find之后底层记录的索引会变
        //0，4
        while (m.find()) {
            //方法底层会根据find方法记录的索引进行字符串的截取
            // substring(起始索引，结束索引);包头不包尾
            // (0,4)但是不包含4索引
            // 会把截取的小串进行返回。-->Java
            String s = m.group();
            System.out.println(s);
        }


    }
}
