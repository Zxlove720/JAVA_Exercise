package demo1;
import java.util.Scanner;
// 方法练习(重载)
//public class exercise20240530 {
//    public static int sum(int a, int b){
//        System.out.println("这是int");
//        return a + b;
//    }
//    public static float sum(float a, float b){
//        System.out.println("这是float");
//        return a + b;
//    }
//    public static byte sum(byte a, byte b){
//        System.out.println("这是byte");
//        return (byte)(a + b);
//    }
//    public static long sum(long a, long b){
//        System.out.println("这是long");
//        return a + b;
//    }
//
//    public static void main(String[] args){
//        // 重载(求和方法)
//        Scanner sc = new Scanner(System.in);
//        // 整型
//        int a,b;
//        System.out.println("请输入a和b");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        int result = sum(a, b);
//        System.out.println(result);
//        // 浮点型
//        float x,y;
//        System.out.println("请输入x和y");
//        x = sc.nextFloat();
//        y = sc.nextFloat();
//        float result1 = sum(x, y);
//        System.out.println(result1);
//        // byte型
//        System.out.println("请输入p和q");
//        byte p = sc.nextByte();
//        byte q = sc.nextByte();
//        byte result2 = sum(p, q);
//        System.out.println(result2);
//        // 长整型
//        System.out.println("请输入j和k");
//        long j = sc.nextLong();
//        long k = sc.nextLong();
//        long result3 = sum(j, k);
//        System.out.println(result3);
//    }
//}

// 遍历数组
public class exercise20240530{
    public static void display_arr(int[] arr){
        int i;
        for(i = 0; i < arr.length; i++){
            System.out.printf("%d ",arr[i]);
        }
    }

    public static int find_max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int search_arr(int[] arr, int key){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] > key){
                right = mid - 1;
            }
            else if(arr[mid] < key){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static int[] copy_range(int[] arr, int from, int to, int n){
        int[] new_arr = new int[n];
        int i;
        int j = 0;
        for(i = from;i <= to; i++, j++){
            new_arr[j] = arr[i];
        }
        return new_arr;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("你需要一个多大的数组?");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            arr[i] = sc.nextInt();
        }
        display_arr(arr);
        int max = find_max(arr);
        System.out.println("\n" + max);
        System.out.println("请输入你想要查找的数");
        int key = sc.nextInt();
        int result = search_arr(arr, key);
        if(result == -1){
            System.out.println("无法找到");
        }
        else{
            System.out.println("找到了" + "下标是" + result);
        }
        // 数组拷贝
        System.out.println("请输入起始索引");
        int from = sc.nextInt();
        int to = sc.nextInt();
        int size = to - from + 1;
        int[] new_array = copy_range(arr, from, to, size);
        for (int i = 0; i < new_array.length; i++) {
            System.out.printf("%d ",new_array[i]);
        }

    }
}
