package SearchExercise20240723;
import java.util.Scanner;
public class SearchExercise3 {
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

    // 插值查找，通过将每次查找的点进行改进（mid），让mid值的变化更靠近关键字key，可以间接的减少比较的次数
    // 细节：和二分查找几乎一样，除了对于mid的计算不同，所以说插值查找也需要查找表有序
    // 并且对于表长较大，而关键字分布又比较均匀的查找表来说，插值查找算法的平均性能比折半查找要好的多，
    // 但是对于分布不均匀的查找表，插值查找不建议选择
    public static int searchImprove(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
        while (low <= high) {
            int mid = low+((key-array[low])*(high-low))/(array[high]-array[low]);
            // 改变了mid的计算，使得让mid的变化更加接近查找关键字
            if (array[mid] > key) {
                high = mid - 1;
            } else if (array[mid] < key) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}



