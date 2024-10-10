package demo1;
import java.util.Scanner; // 导包
public class exercise20240701 {
    public static void sort1(int[] array){
        int i;
        int j;
        for(i = 0; i < array.length - 1; i++){
            for(j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void sort2(int[] array){
        int i;
        int j;
        for(i = 0; i < array.length - 1; i++){
            for(j = 0; j < array.length - i - 1; j++){
                if(array[j] < array[j + 1]){
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void print_array(int[] array){
        int i;
        for(i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); // 创建一个新的Scanner类
        System.out.println("请输入你想要多大的数组?");
        int n = sc.nextInt();
        int[] array = new int[n];
        int i;
        for(i = 0; i < n; i++){
            System.out.printf("请输入第%d个数字\n", i + 1);
            array[i] = sc.nextInt();
        }
        // 冒泡排序
        System.out.println("请选择你想要排序的方式");
        System.out.println("        1.升序");
        System.out.println("        2.降序");
        int choice = sc.nextInt();
        switch(choice){
            case 1 -> sort1(array);
            case 2 -> sort2(array);
        }
        print_array(array);
    }
}
