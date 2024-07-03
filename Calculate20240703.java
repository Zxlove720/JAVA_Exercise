package demo1;
import java.util.Scanner;
public class Calculate20240703 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        System.out.println("请输入运算符");
        int operator = sc.nextInt();
        switch (operator){
            case 1 -> System.out.println(number1 + "+" + number2 + "=" + (number1 + number2));
            case 2 -> System.out.println(number1 + "-" + number2 + "=" + (number1 - number2));
            case 3 -> System.out.println(number1 + "*" + number2 + "=" + (number1 * number2));
            case 4 -> System.out.println(number1 + "/" + number2 + "=" + (number1 / number2));
            default -> System.out.println("运算符选择错误");
        }
    }
}
