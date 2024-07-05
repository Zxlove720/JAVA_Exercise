package Exercise20240705;
import java.util.Scanner;
public class Exercise20240705 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请问你想要多大的数组?");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        printArray(array);
        System.out.println("请输入你想要插入的位置");
        int place = sc.nextInt();
        System.out.println("请输入你想要插入的元素");
        int element = sc.nextInt();
        array = insertElement(array, place, element);
        printArray(array);
        int count = countArray(array);
        System.out.printf("数组中有%d个元素", count);
        System.out.println("请输入你想要删除的元素");
        element = sc.nextInt();
        array = deleteElement(array, element);
        printArray(array);
    }

    public static int[] insertElement(int[] array, int place, int element){
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        for (int i = newArray.length - 1; i > place; i--) {
            newArray[i] = newArray[i - 1];
        }
        newArray[place] = element;
        return newArray;
    }


    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public static int countArray(int[] array){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != 0){
                count++;
            }
        }
        return count;
    }

    public static int[] deleteElement(int[] array, int element){
        int[] newArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if(array[i] == element){
                continue; // 由于先判断是否是被删除的元素，所以说用原数组的长度并不会越界
            }
            newArray[j++] = array[i];
        }
        return newArray;
    }
}
