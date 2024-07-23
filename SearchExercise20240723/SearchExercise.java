package SearchExercise20240723;
import java.util.Scanner;
public class SearchExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("需要多大的数组?");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        System.out.println("请输入想要查找的元素");
        int key = sc.nextInt();
        int result = searchElement(array, key);
        if (result != -1) {
            System.out.println("成功找到");
            System.out.printf("该元素的下标是%d", result);
        } else {
            System.out.println("数组中没有该元素");
        }
    }

    public static int searchElement(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                return i;
            }
        }
        return -1;
    }
    // 这是最简单的查找，效率为O(n)
}
