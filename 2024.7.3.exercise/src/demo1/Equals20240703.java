package demo1;
import java.util.Scanner;
public class Equals20240703 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数组的长度");
        int n = sc.nextInt();
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array1[i] = sc.nextInt();
        }
        System.out.println("请输入第二个数组的长度");
        n = sc.nextInt();
        int[] array2 = new int[n];
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array2[i] = sc.nextInt();
        }
        boolean flag = my_equals(array1 , array2);
        if (flag){
            System.out.println("两个数组相同");
        } else {
            System.out.println("两个数组不同");
        }
    }
    public static boolean my_equals(int[] array1, int[] array2){
        if (array1.length != array2.length){
            return false;
        } else{
            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < array1.length; i++) {
                sum1 += array1[i];
            }
            for (int i = 0; i < array2.length; i++) {
                sum2 += array2[i];
            }
            if (sum1 == sum2){
                return true;
            } else{
                return false;
            }
        }
    }
}
