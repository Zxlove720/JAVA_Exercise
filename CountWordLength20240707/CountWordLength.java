package CountWordLength20240707;
import java.util.Scanner;
public class CountWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        int count = countWordLength(str);
        System.out.printf("最后一个单词长%d", count);
    }

    public static int countWordLength(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ' && count != 0) {
                break;
            }
            if (str.charAt(i) == ' '){
                continue;
            }
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' ||
                    str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
