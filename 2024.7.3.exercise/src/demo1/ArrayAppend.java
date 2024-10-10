package demo1;
import java.util.Scanner;
public class ArrayAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入原数组长度");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        System.out.println("原来数组是");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
        System.out.println("请输入你想要增加的元素");
        int element = sc.nextInt();
        int[] array2 = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        array2[array2.length - 1] = element;
        sortArray(array2);
        System.out.println("增加后的数组是");
        for (int i = 0; i < array2.length; i++) {
            System.out.printf("%d ", array2[i]);
        }
    }
    public static void sortArray(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
