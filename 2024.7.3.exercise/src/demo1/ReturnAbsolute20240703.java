package demo1;
import java.util.Scanner;
public class ReturnAbsolute20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        double number = sc.nextDouble();
        double result = ReturnAbsolute(number);
        System.out.println(number + "的绝对值是" + result);
    }
    public static double ReturnAbsolute(double number){
        if (number >= 0){
            return number;
        } else {
            return (number += -2 * number);
        }
    }
}
