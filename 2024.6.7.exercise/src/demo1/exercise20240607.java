package demo1;

import java.util.Scanner;

public class exercise20240607 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入被除数");
//        int number1 = sc.nextInt();
//        System.out.printf("请输入除数\n");
//        int number2 = sc.nextInt();
//        int count = 0;
//        int i;
//        for(i = number1; i >= 0; i -= number2){
//            if(i < number2){
//                System.out.println("商是" + count);
//                System.out.println("余数是" + i);
//                break;
//            }
//            count++;
//        }
//    }
//
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数");
        int number1 = sc.nextInt();
        int number2;
        while (true) {
            System.out.println("请输入除数");
            number2 = sc.nextInt();
            if (number2 != 0) {
                break;
            }
            System.out.println("除数不能为0");
        }
        int count = 0;
        while (number1 >= number2) {
            number1 -= number2;
            count++;
        }
        System.out.println("商是" + count);
        System.out.println("余数是" + number1);
    }
}
