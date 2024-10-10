package CountElement20240706;
import java.util.Scanner;
public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.nextLine();
        countElement(str);
    }

    public static void countElement(String str){
        int words = 0;
        int numbers = 0;
        int others = 0;
        char temp;
        for (int i = 0; i < str.length(); i++) {
            temp = str.charAt(i);
            if (temp >= '0' && temp <= '9') {
                numbers++;
            } else if ((temp >= 'a' && temp <= 'z') || (temp >= 'A' && temp <= 'Z')) {
                words++;
            } else {
                others++;
            }
        }
        System.out.println("字符串中字母有" + words + "个");
        System.out.println("字符串中数字有" + numbers + "个");
        System.out.println("字符串中其他元素有" + others + "个");
    }
}
