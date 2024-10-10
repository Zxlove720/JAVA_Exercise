package demo1;
import java.util.Scanner;

// sort
public class exercise20240606 {
    public static void sort_arr(int[] arr, int n){
        int i, j;
        for(i = 0; i < n; i++){
            for(j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void display(int[] arr, int n){
        int i;
        for(i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要多大的数组?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for(i = 0; i < n; i++){
            System.out.printf("请输入第%d个元素\n", i + 1);
            arr[i] = sc.nextInt();
        }
        sort_arr(arr, n);
        display(arr, n);
    }
}
