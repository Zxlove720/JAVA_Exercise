package demo1;
import java.util.Scanner;
public class FindMaxOrMin20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要的多大的数组?");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        System.out.println("请选择要查最大值还是最小值");
        int choice = sc.nextInt();
        switch (choice){
            case 1 -> System.out.println(findMax(array));
            case 2 -> System.out.println(findMin(array));
            default -> System.out.println("选择错误,请重新选择");
        }
    }
    public static int findMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
