package RegexDemo2;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "had";

        //1.要求字符串是小写辅音字符开头，后跟ad
        String regex = "[a-z&&[^aeiou]]ad";
        System.out.println("1." + str.matches(regex));

        //2.要求字符串是aeiou中的某个字符开头，后跟ad
        regex = "[a|e|i|o|u]ad";//这种写法相当于：regex = "[aeiou]ad";
        System.out.println("2." + str.matches(regex));

        // \ 转义字符 改变后面那个字符原本的含义
        //练习:以字符串的形式打印一个双引号
        //"在Java中表示字符串的开头或者结尾

        //此时\表示转义字符，改变了后面那个双引号原本的含义
        //把他变成了一个普普通通的双引号而已。
        System.out.println("\"");

        // \表示转义字符
    }
}
