package ChooseSort20240714;

import java.util.Scanner;

public class ChooseSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("要输入多少数字?");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个数字", i + 1);
            array[i] = sc.nextInt();
        }
        chooseSort(array);
        printArray(array);
    }

    public static void chooseSort(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择升序或降序");
        System.out.println("  1.升序 2.降序");
        int choose = sc.nextInt();
        switch (choose) {
            case 1 -> {
                int minIndex;
                for(int i = 0; i < array.length; i++) {
                    minIndex = i;
                    for(int j = i + 1; j < array.length; j++) {
                        if (array[j] < array[minIndex]) {
                            minIndex = j;
                        }
                    }
                    if (i != minIndex) {
                        int temp = array[minIndex];
                        array[minIndex] = array[i];
                        array[i] = temp;
                    }
                }
            }
            case 2 -> {
                int maxIndex;
                for(int i = 0; i < array.length; i++) {
                    maxIndex = i;
                    for(int j = i + 1; j < array.length; j++) {
                        if (array[j] > array[maxIndex]) {
                            maxIndex = j;
                        }
                    }
                    if (i != maxIndex) {
                        int temp = array[maxIndex];
                        array[maxIndex] = array[i];
                        array[i] = temp;
                    }
                }
            }
            default -> {
                System.out.println("选择错误");
            }
        }
        sc.close();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
    }

}
