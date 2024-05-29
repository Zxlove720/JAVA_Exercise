package demo1;
import java.util.Scanner;
import java.util.Random;
//public class exercise20240529 {
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入数组的元素个数?");
//        int n = sc.nextInt();
//        int i;
//        int[] array = new int[100];
//        for(i = 0; i < n; i++){
//            System.out.println("请输入第" + (i + 1) + "个元素");
//            array[i] = sc.nextInt();
//        }
//        for(i = 0; i < n; i++) {
//            System.out.printf("%d ", array[i]);
//        }
//        // 二分查找
////        System.out.println("请输入你想要查找的值");
////        int key = sc.nextInt();
////        int left = 0;
////        int right = n - 1;
////        boolean flag = false;
////        while(left <= right) {
////            int mid = (left + right) / 2;
////            if (array[mid] > key) {
////                right = mid - 1;
////            } else if (array[mid] < key) {
////                left = mid + 1;
////            } else {
////                System.out.printf("成功找到,下标是%d", mid);
////                flag = true;
////                break;
////            }
////        }
////        if(!flag){
////            System.out.println("无法找到,请重新输入");
////        }
//        //增加一个数
//        System.out.println("请输入你想要增加的数值");
//        int number;
//        number = sc.nextInt();
//        array[n] = number;
//        n++;
//        for(i = 0; i < n; i++){
//            System.out.printf("%d ",array[i]);
//        }
////        System.out.println("请输入你想要插入的数值");
////        number = sc.nextInt();
////        System.out.println("请输入你想要插入的位置");
////        int place = sc.nextInt();
////        n++;
////        for(i = n - 1; i >= place; i--){
////            array[i] = array[i-1];
////            if(i == place){
////                array[i] = number;
////            }
////        }
////        for(i = 0; i < n; i++){
////            System.out.printf("%d ",array[i]);
////        }
////        System.out.println("请输入你想要插入的数值");
////        number = sc.nextInt();
////        System.out.println("请输入你想要插入的位置");
////        int place = sc.nextInt();
////        n++;
////        for(i = n - 1; i > place; i--){
////            array[i] = array[i - 1];
////        }
////        array[place] = number;
////        for(i = 0; i < n; i++){
////            System.out.printf("%d ",array[i]);
////        }
//
//
//
//    }
//}

// 数组练习
//public class exercise20240529{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        //创建一个数组
////        int[] array = new int[]{1, 2, 3, 4, 5};
////        // 遍历
////        for (int i = 0; i < array.length; i++) {
////            System.out.println(array[i]);
////        }
//        int[] array = new int[20];
//        int i;
//        System.out.println("请输入你需要多大的数组?");
//        int n = sc.nextInt();
//        for(i = 0;i < n; i++){
//            array[i] = sc.nextInt();
//        }
//        for(i = 0; i < n; i++){
//            System.out.printf("%d ",array[i]);
//        }
//        // 数组操作
//        for(i = 0; i < n; i++){
//            if(array[i] % 2 == 0){
//                array[i] = array[i] / 2;
//            }else if(array[i] % 2 == 1){
//                array[i] = array[i] * 2;
//            }
//        }
//        System.out.printf("\n");
//        for(i = 0; i < n; i++){
//            System.out.printf("%d ",array[i]);
//        }
//        int count = 0;
//        for(i = 0; i < n; i++){
//            if(array[i] % 3 == 0){
//                count++;
//            }
//        }
//        System.out.println(" ");
//        System.out.println(count);
//    }
//}

// 数组找最大值
//public class exercise20240529{
//    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        System.out.println("你需要多大的数组?");
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for(int i = 0; i < n; i++){
//            System.out.println("请输入第" + (i + 1) + "个元素");
//            array[i] = sc.nextInt();
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("%d ", array[i]);
//        }
//        // 求最大值
////        int max = array[0];
////        for (int i = 1; i < array.length; i++){
////            if(array[i] > max){
////                max = array[i];
////            }
////        }
////        System.out.println(max);
//        // 平均数求和
////        int sum = 0;
////        for (int i = 0; i < array.length; i++) {
////            sum += array[i];
////        }
////        double average = (sum * 1.0) / array.length;
////        System.out.println("\n" + average);
////        int count = 0;
////        for (int i = 0; i < array.length; i++) {
////            if(array[i] < average){
////                count++;
////            }
////        }
////        System.out.println("一共有" + count + "个元素小于平均数");
//
//        // 交换数据
////        System.out.println("\n请输入你想要交换的第一个数的索引值");
////        int index1 = sc.nextInt();
////        System.out.println("请输入你想要交换的第二个数的索引值");
////        int index2 = sc.nextInt();
////        int temp = array[index2];
////        array[index2] = array[index1];
////        array[index1] = temp;
////        for (int i = 0; i < array.length; i++) {
////            System.out.printf("%d ", array[i]);
////        }
//        // 打乱数据
//        int temp;
//        for (int i = 0; i < array.length; i++) {
//            temp = array[i];
//            int rand_number = r.nextInt(array.length);
//            array[i] = array[rand_number];
//            array[rand_number] = temp;
//        }
//        System.out.println("\n");
//        for (int i = 0; i < array.length; i++) {
//            System.out.printf("%d ", array[i]);
//        }
//    }
//}


// Java方法练习(数组方面)
public class exercise20240529{
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





