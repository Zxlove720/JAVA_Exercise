package Exercise20240723;
import java.util.Scanner;
public class Exercise3 {
    public static void main(String[] args) {
//        需求：
//        定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int number = sc.nextInt();
        String str = "";
        while (number > 0) {
            str = number % 2 + str;
            number /= 2;
        }
        System.out.println(str);
    }
}
