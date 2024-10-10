package demo1;
import java.util.Scanner;
// 逢7过
//public class exercise20240528 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入终止数字");
//        int n = sc.nextInt();
//        int i;
//        for(i = 1; i <= n; i++){
//            if(i % 7 == 0 || i % 10 == 7 || (i / 10) % 10 == 7){
//                continue;
//            }
//            System.out.println(i);
//        }
//    }
//}

// 平方根(非精确)
//public class exercise20240528{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入你要查看的数字");
//        int number = sc.nextInt();
//        int i;
//        for(i = 1; i <= number; i++ ){
//            if(i * i == number){
//                System.out.printf("%d的平方根是%d", number, i);
//                break;
//            }
//            else if(i * i > number){
//                System.out.printf("%d的平方根是%d", number, i - 1);
//                break;
//            }
//        }
//    }
//}

// 判断质数
//public class exercise20240528{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个数");
//        int number = sc.nextInt();
//        int i;
//        boolean flag = true;
//        for(i = 2; i < number; i++){
//            if(number % i == 0){
//                flag = false;
//                break;
//            }
//        }
//        if(!flag){
//            System.out.println(number + "不是质数");
//        }
//        else{
//            System.out.println(number + "是质数");
//        }
//    }
//}

// 猜数字
import java.util.Random;
public class exercise20240528{
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
}
