package RandomString20240706;
import java.util.Random;
import java.util.Scanner;
public class RandomString {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        char[] charArray = changeArray(str);
        int randomNumber;
        char temp;
        for (int i = charArray.length - 1; i > 0; i--) {
            randomNumber = r.nextInt(i + 1);
            temp = charArray[randomNumber];
            charArray[randomNumber] = charArray[i];
            charArray[i] = temp;
        }
        String targetArray = new String(charArray);
        System.out.println(targetArray);
    }

    public static char[] changeArray(String str){
        char[] array = new char[str.length()];
        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i);
        }
        return array;
    }
}
