package demo1;
import java.util.Scanner;
import java.util.Random;
public class Exercise20240702 {
    public static boolean isTrue(int number) {
        int temp = number;
        int mid = 0;
        while (temp != 0) {
            mid = (mid * 10) + (temp % 10);
            temp /= 10;
        }
        System.out.println(mid);
        if (mid == number) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数");
//        int number = sc.nextInt();
//        if (isTrue(number)){
//            System.out.println("yes");
//        } else{
//            System.out.println("no");
//        }
//        System.out.println("请输入被除数");
//        int number1 = sc.nextInt();
//        System.out.println("请输入除数");
//        int number2 = sc.nextInt();
//        int count = 0;
//        while (number1 >= number2){
//            number1 -= number2;
//            count++;
//        }
//        System.out.println("商是" + count);
//        if (number1 == 0){
//            System.out.println("可以整除，余数是0");
//        } else{
//            System.out.println("余数是" + number1);
//        }
        // 逢七过
//        int i;
//        for(i = 1; i <= 100; i++){
//            if(i % 7 == 0 || i / 10 == 7 || i % 10 == 7) {
//                continue;
//            } else {
//                System.out.println(i);
//            }
//        }

        // 算平方根(整数部分)
//        System.out.println("请输入你想要算平方根的数");
//        int number = sc.nextInt();
//        int i;
//        int result = 0;
//        for(i = 1; i <= number; i++){
//            if (i * i == number){
//                result = i;
//                break;
//            } else if (i * i > number){
//                result = i - 1;
//                break;
//            }
//        }
//        System.out.println(number + "的平方根是" + result);

        // 求质数
//        System.out.println("请输入要判断的数");
//        int number = sc.nextInt();
//        int i;
//        boolean flag = true;
//        for (i = 2; i < number; i++){
//            if (number % i == 0){
//                flag = false;
//            }
//        }
//        if (flag){
//            System.out.println("is prime");
//        } else {
//            System.out.println("is not prime");
//        }
        // 遍历数组并求和
//        int[] array = new int[5];
//        int i;
//        for(i = 0; i < array.length; i++){
//            array[i] = sc.nextInt();
//        }
//        int sum = 0;
//        for(i= 0; i < array.length; i++){
//            sum += array[i];
//        }
//        System.out.println("数组的和是" + sum);
        // 交换数组中的数据
//        System.out.println("请输入你想要多大的数组");
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        int i;
//        for(i = 0; i < array.length; i++){
//            System.out.printf("请输入第" + (i + 1) + "个数据");
//            array[i] = sc.nextInt();
//        }
//        i = 0;
//        int j = array.length - 1;
//        int temp = 0;
//        while(i != j){
//            temp = array[j];
//            array[j] = array[i];
//            array[i] = temp;
//            i++;
//            j--;
//        }
//        for(i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
        // 打乱数组中的数据
        System.out.println("请输入你想要多大的数组");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个数据", i + 1);
            array[i] = sc.nextInt();
        }
        Random r = new Random();
        int randNumber;
        int temp;
        for (int i = 0; i < array.length; i++) {
            randNumber = r.nextInt(array.length);
            temp = array[randNumber];
            array[randNumber] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
