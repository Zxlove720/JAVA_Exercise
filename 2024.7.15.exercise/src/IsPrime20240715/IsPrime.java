package IsPrime20240715;
// 通过Math类中的pow方法可以简化判断一个数是否是质数
import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要判断的数");
        int number = sc.nextInt();
        if (isPrime(number)) {
            System.out.println(number + "是质数");
        } else {
            System.out.println(number + "不是质数");
        }
    }

    public static boolean isPrime(int number) {
        int key = (int)Math.sqrt(number); // sqrt 返回的是double值
        for (int i = 2; i <= key; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
