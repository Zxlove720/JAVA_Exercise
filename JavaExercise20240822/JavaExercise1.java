package JavaExercise20240822;

import java.util.Scanner;

public class JavaExercise1 {
    public static void main(String[] args) {
        int[] array = creatArray();
        bubbleSort(array);
    }

    public static int[] creatArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想要多大的数组");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        return array;
    }


    // 冒泡排序
    public static void bubbleSort(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择升序还是降序");
        System.out.println("1.升序     2.降序");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {
                        if (array[j + 1] < array[j]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < array.length - 1; i++) {
                    for (int j = 0; j < array.length - i - 1; j++) {
                        if (array[j + 1] > array[j]) {
                            int temp = array[j];
                            array[j] = array[j + 1];
                            array[j + 1] = temp;
                        }
                    }
                }
            }
            default -> {
                System.out.println("选择错误，请重新选择");
            }
        }
    }
}
