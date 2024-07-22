package StringAndRegex20240722;

public class StringRegexExercise {
    public static void main(String[] args) {
        /*String str = "can can need";
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length; i++) {
            System.out.printf("%s ", strArray[i]);
        }*/

        // 可以自定义正则来给split方法传参，从而达到切割效果
        // 方法在底层也创建了文本解析器的对象(Matcher)，然后从头去读大串，发现有满足正则的，则进行切割
        String str = "小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠";
        String[] strArray = str.split("[\\w&&[^_]]+");
        for (String s : strArray) {
            System.out.println(s);
        }
    }
}
