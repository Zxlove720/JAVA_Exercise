package JavaExercise20241008;

import java.util.Random;
import java.util.Scanner;

public class JavaExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入行数");
//        int number = sc.nextInt();
//        for (int i = 1; i <= number; i++) {
//            if (i > 8) {
//                break;
//            }
//            int j = 0;
//            while(j < i) {
//                System.out.print("*");
//                j++;
//            }
//            System.out.println();
//        }

//        menu();
//        double yashua = 8.0;
//        double maojin = 10.0;
//        double cup = 18.0;
//        double apple = 12.5;
//        double banana = 15.5;
//
//        System.out.println("请选择：Y：购买 N：退出");
//        while (sc.nextLine().equalsIgnoreCase("Y")) {
//            System.out.println("请输入想要购买的物品");
//            String thing = sc.nextLine();
//            switch (thing) {
//                case "牙刷" : {
//                    System.out.println("请输入想要买几个");
//                    int number = Integer.parseInt(sc.nextLine());
//                    System.out.println("你购买了" + number + "支牙膏" + " 需要" + (yashua * number) + "元");
//                    break;
//                }
//                case "毛巾" : {
//                    System.out.println("请输入想要买几个");
//                    int number = Integer.parseInt(sc.nextLine());
//                    System.out.println("你购买了" + number + "张毛巾" + " 需要" + (maojin * number) + "元");
//                    break;
//                }
//                case "水杯" : {
//                    System.out.println("请输入想要买几个");
//                    int number = Integer.parseInt(sc.nextLine());
//                    System.out.println("你购买了" + number + "个水杯" + " 需要" + (cup * number) + "元");
//                    break;
//                }
//                case "苹果" : {
//                    System.out.println("请输入想要买几个");
//                    int number = Integer.parseInt(sc.nextLine());
//                    System.out.println("你购买了" + number + "个苹果" + " 需要" + (apple * number) + "元");
//                    break;
//                }
//                case "香蕉" : {
//                    System.out.println("请输入想要买几个");
//                    int number = Integer.parseInt(sc.nextLine());
//                    System.out.println("你购买了" + number + "支香蕉" + " 需要" + (banana * number) + "元");
//                    break;
//                }
//                default : System.out.println("选择错误");
//            }
//            System.out.println("请继续选择");
//        }
//        System.out.println("感谢使用");


//        String[] array = {"剪刀", "石头", "布"};
//        Random r = new Random();
//        int i = 0;
//        while(i < 3) {
//            int randomNumber = r.nextInt(3);
//            String computer = array[randomNumber];
//            System.out.println(computer);
//            System.out.println("请出");
//            String key = sc.nextLine();
//
//            if (key.equals(computer)) {
//                System.out.println("平局");
//                i++;
//                continue;
//            } else {
//                if (key.equals("石头")) {
//                    if (computer.equals("剪刀")) {
//                        System.out.println("you win");
//                        break;
//                    } else if (computer.equals("布")) {
//                        System.out.println("you lose");
//                        break;
//                    }
//                }
//                if (key.equals("剪刀")) {
//                    if (computer.equals("布")) {
//                        System.out.println("you win");
//                        break;
//                    } else if (computer.equals("石头")) {
//                        System.out.println("you lose");
//                        break;
//                    }
//                }
//                if (key.equals("布")) {
//                    if (computer.equals("石头")) {
//                        System.out.println("you win");
//                        break;
//                    } else if (computer.equals("剪刀")) {
//                        System.out.println("you lose");
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println("请输入有几个组");
//        int n = sc.nextInt();
//        int[][] team = new int[n][];
//        for (int i = 0; i < team.length; i++) {
//            System.out.println("请输入第" + (i + 1) + "个组的人数");
//            int number = sc.nextInt();
//            int sum = 0;
//            for (int j = 0; j < number; j++) {
//                System.out.println("请输入第" + (i + 1) + "组第" + (j + 1) + "人的业绩");
//                int money = sc.nextInt();
//                sum += money;
//            }
//            System.out.println("第" + (i + 1) + "组的总业绩是" + sum);
//
//        System.out.println("请输入长");
//        int length = sc.nextInt();
//        System.out.println("请输入宽");
//        int width = sc.nextInt();
//        draw(length, width);
        System.out.println("请输入两个数");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        System.out.println(add(number1, number2));



    }

    public static int add(int number1, int number2) {
        return number1 + number2;
    }

    public static void draw(int length, int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void menu() {
        System.out.println("欢迎使用商店");
        System.out.println("牙刷的价格是：8.0元");
        System.out.println("毛巾的价格是：10.0元");
        System.out.println("水杯的价格是：18.0元");
        System.out.println("苹果的价格是：12.5元");
        System.out.println("香蕉的价格是：15.5元");
    }
}



