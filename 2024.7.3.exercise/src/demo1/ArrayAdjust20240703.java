package demo1;
import java.util.Scanner;
public class ArrayAdjust20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要多大的数组?");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        int[] adjustArray = new int[array.length];
        int left = 0;
        int right = adjustArray.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                adjustArray[left] = array[i];
                left++;
            } else{
                adjustArray[right] = array[i];
                right--;
            }
        }
        for (int i = 0; i < adjustArray.length; i++) {
            System.out.printf("%d ", adjustArray[i]);
        }
    }
}
