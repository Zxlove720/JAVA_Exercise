package CountSonString20240706;
import java.util.Scanner;
public class CountSonString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        System.out.println("请输入你想要查找的子串");
        String sonStr = sc.nextLine();
        int count = countSonString(str, sonStr);
        System.out.printf("%s在整个字符串中出现了%d次", sonStr, count);
    }

    /*public static int countSonString(String str, String sonStr) {
        int count = 0;
        int place = 0;
        while(true) {
            place = str.indexOf(sonStr);
            if (place == -1) {
                break;
            } else {
                count++;
                str = str.substring(place + sonStr.length());
                // 这里必须要将已经查找过的串截取掉，不然会死循环
            }
        }
        return count;
    }*/

    public static int countSonString(String str, String sonStr) {
        String newStr = str.replace(sonStr,"");
        return (str.length() - newStr.length()) / sonStr.length();
    }
}
