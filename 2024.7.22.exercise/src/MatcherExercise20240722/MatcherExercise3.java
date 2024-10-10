package MatcherExercise20240722;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MatcherExercise3 {
    public static void main(String[] args) {
        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        /* 需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号
        需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        需求3:爬取除了版本号为8，11.17的Java文本 */

        // 后面的？表示前面的Java，=表示在Java后面可以是8或者11或者17，但是在获取的时候只获取前半部分
        // 相当于后面的部分是不获取的，只是用来确定哪些地方的Java可以获取
        Pattern rule1 = Pattern.compile("((?i)Java)(?=8|11|17)");
        // 后面的？表示前面的Java，：表示在Java后面可以是8或者11或者17，两个部分都要获取，相当于是"((?i)Java)(8|11|17)"
        Pattern rule2 = Pattern.compile("((?i)Java)(?:8|11|17)");
        // 后面的？表示前面的Java，！表示在Java后面不可以是8或者11或者17，不然就不会获取，也是只获取前面的部分，后面的
        // 部分只是用来确定那些地方的Java不能获取
        Pattern rule3 = Pattern.compile("((?i)Java)(?!8|11|17)");

        Matcher m1 = rule1.matcher(str);
        while (m1.find()) {
            String result1 = m1.group();
            System.out.println(result1);
        }
        System.out.println("-----------------------------");
        Matcher m2 = rule2.matcher(str);
        while (m2.find()) {
            String result2 = m2.group();
            System.out.println(result2);
        }
        System.out.println("-----------------------------");

        Matcher m3 = rule3.matcher(str);
        while (m3.find()) {
            String result3 = m3.group();
            System.out.println(result3);
        }


    }
}
