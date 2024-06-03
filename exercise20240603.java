package demo1;
//
//import java.util.Random;
//import java.util.Scanner;
//public class exercise20240603 {
//// 逢7过
////public class exercise20240603 {
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入终止数字");
////        int n = sc.nextInt();
////        int i;
////        for(i = 1; i <= n; i++){
////            if(i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7){
////                continue;
////            }
////            System.out.println(i);
////        }
////    }
////}
//
//// 平方根(非精确)
////public class exercise20240603{
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入你要查看的数字");
////        int number = sc.nextInt();
////        int i;
////        for(i = 1; i <= number; i++ ){
////            if(i * i == number){
////                System.out.printf("%d的平方根是%d", number, i);
////                break;
////            }
////            else if(i * i > number){
////                System.out.printf("%d的平方根是%d", number, i - 1);
////                break;
////            }
////        }
////    }
////}
//
//// 判断质数
////public class exercise20240603{
////    public static void main(String[] args){
////        Scanner sc = new Scanner(System.in);
////        System.out.println("请输入一个数");
////        int number = sc.nextInt();
////        int i;
////        boolean flag = true;
////        for(i = 2; i < number; i++){
////            if(number % i == 0){
////                flag = false;
////                break;
////            }
////        }
////        if(!flag){
////            System.out.println(number + "不是质数");
////        }
////        else{
////            System.out.println(number + "是质数");
////        }
////    }
////}
//
//// 猜数字
//        public static void main(String[] args){
//            Random r = new Random();
//            Scanner sc = new Scanner(System.in);
//            //生成随机数:
//            int rand_number = r.nextInt(10) + 1;
//            int count = 0;
//            int guess;
//            boolean flag = false;
//            while(count < 3){
//                System.out.println("请进行第" + (count + 1) + "次猜数字");
//                System.out.println("(你还有" + (3 - count) + "次机会)");
//                guess = sc.nextInt();
//                if(guess > rand_number){
//                    System.out.println("猜大了,请再试一次");
//                    count++;
//                }
//                else if(guess < rand_number){
//                    System.out.println("猜小了,请再试一次");
//                    count++;
//                }
//                else{
//                    flag = true;
//                    break;
//                }
//            }
//            if(flag){
//                System.out.println("恭喜你猜对了");
//            }
//            else{
//                System.out.println("很遗憾,你没有猜对");
//            }
//        }
//    }

import java.util.Scanner;
// Java方法练习(数组方面)
public class exercise20240603{
    public static void menu(){
        System.out.println("\t\t\t\t欢迎操作数组");
        System.out.println("\t\t\t\t 1.打印数组");
        System.out.println("\t\t\t\t 2.增加元素");
        System.out.println("\t\t\t\t 3.插入元素");
        System.out.println("\t\t\t\t 4.删除元素");
        System.out.println("\t\t\t\t 5.查找元素");
        System.out.println("\t\t\t\t 6.修改元素");
        System.out.println("\t\t\t\t 0.退出系统");
    }

    public static void display(int[] array, int n){
        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println("\n");
    }

    public static void appendnumber(int[] array, int element, int n){
        array[n - 1] = element;
    }

    public static void insertnumber(int[] array, int element, int place, int n){
        for (int i = n; i > place; i--) {
            array[i] = array[i - 1];
        }
        array[place] = element;
    }

    public static void deletenumber(int[] array, int place, int n){
        for (int i = place; i < n; i++) {
            array[i] = array[i + 1];
        }
    }

    public static int searchnumber(int[] array, int element, int n){
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(array[mid] > element){
                right = mid - 1;
            }
            else if(array[mid] < element){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void replacenumber(int[] array, int result, int new_number){
        array[result] = new_number;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要多大的数组?");
        int n = sc.nextInt();
        int[] array = new int[20];
        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + (i + 1) + "个元素");
            array[i] = sc.nextInt();
        }
        int choice;
        boolean flag = true;
        do{
            menu();
            System.out.println("请选择功能");
            choice = sc.nextInt();
            switch(choice){
                case 1 -> {
                    display(array, n);
                }
                case 2 -> {
                    System.out.println("请输入你想要在数组中增加的元素");
                    int element = sc.nextInt();
                    n++;
                    appendnumber(array, element, n);
                }
                case 3 -> {
                    System.out.println("请输入你想要插入的元素");
                    int element = sc.nextInt();
                    System.out.println("请输入你想要插入的位置");
                    int place = sc.nextInt();
                    n++;
                    insertnumber(array, element, place, n);
                }
                case 4 -> {
                    System.out.println("请输入想要删除的位置");
                    int place = sc.nextInt();
                    n--;
                    deletenumber(array, place, n);
                }
                case 5 -> {
                    System.out.println("请输入你想要查找的元素");
                    int element = sc.nextInt();
                    int result = searchnumber(array, element, n);
                    if(result == -1){
                        System.out.printf(" 无法找到\n");
                    }
                    else{
                        System.out.printf("成功找到,下标是%d\n", result);
                    }
                }
                case 6 -> {
                    System.out.printf("请输入你想要改的数字\n");
                    int index = sc.nextInt();
                    int result = searchnumber(array, index, n);
                    System.out.println("请输入你想要改成什么");
                    int new_number = sc.nextInt();
                    replacenumber(array, result, new_number);
                }
                case 0 -> {
                    flag = false;
                    System.out.println("感谢使用");
                }
                default -> {
                    System.out.println("选择错误,请重新选择");;
                }
            }
        }while(flag);
    }
}