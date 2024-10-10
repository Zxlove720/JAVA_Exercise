package demo1;
import java.util.Scanner;
public class ArrayToNumber20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum * 10 + array[i];
        }
        System.out.println(sum);
    }
}

