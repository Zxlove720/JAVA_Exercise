package SearchExercise20240723;
import java.util.Scanner;
public class SearchExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("需要多大的数组?");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        System.out.println("请输入你想要查找的元素");
        int key = sc.nextInt();
        int flag = searchImprove(array, key);
        if (flag == -1) {
            System.out.println("数组中没有该元素");
        } else {
            System.out.println("查找成功，下标是" + flag);
        }
    }

    // 二分查找，使用十分的广泛，时间复杂度是O(log2n)，但是二分查找需要元素有序才可以使用
    public static int searchImprove(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] > key) {
                high = mid - 1;
            } else if(array[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
