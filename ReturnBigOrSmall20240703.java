package demo1;
import java.util.Scanner;
public class ReturnBigOrSmall20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        System.out.println("请选择你要更大的还是更小的?");
        int choice = sc.nextInt();
        int result = 0;
        switch(choice) {
            case 1 -> result = returnBig(number1, number2);
            case 2 -> result = returnSmall(number1, number2);
            default -> System.out.println("选择错误");
        }
        System.out.println(result);
    }
    public static int returnBig(int number1, int number2){
        int result = number1 > number2 ? number1 : number2;
        return result;
    }
    public static int returnSmall(int number1, int number2){
        int result = number1 < number2 ? number1 : number2;
        return result;
    }
    public static int returnLimit(int number1, int number2, int number3){
        int result = number1 > number2 ? (number1 > number3 ? number1 : number3) : (number2 > number3 ? number2 : number3);
        return result;
    }
}
