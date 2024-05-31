package demo1;

import java.util.Random;
import java.util.Scanner;

/*public class exercise20240531 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        //生成随机数:
        int rand_number = r.nextInt(10) + 1;
        int count = 0;
        int guess;
        boolean flag = false;
        while(count < 3){
            System.out.println("请进行第" + (count + 1) + "次猜数字");
            System.out.println("(你还有" + (3 - count) + "次机会)");
            guess = sc.nextInt();
            if(guess > rand_number){
                System.out.println("猜大了,请再试一次");
                count++;
            }
            else if(guess < rand_number){
                System.out.println("猜小了,请再试一次");
                count++;
            }
            else{
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("恭喜你猜对了");
        }
        else{
            System.out.println("很遗憾,你没有猜对");
        }
    }
}*/

public class exercise20240531{
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

