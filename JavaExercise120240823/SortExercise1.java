package JavaExercise120240823;

import java.util.Scanner;

public class SortExercise1 {
    public static void main(String[] args) {
        int[] array = creatArray();
        insertSort(array);
        printArray(array);
    }

    // 插入排序
    public static void insertSort(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择升序还是降序");
        System.out.println("1.升序     2.降序");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        int j;
                        for (j = i - 1; j >= 0 && array[j] > temp; j--) {
                            array[j + 1] = array[j];
                        }
                        array[j + 1] = temp; // 将temp赋值给array[j + 1]是因为j会多自减一次
                    }
                }
            }
            case 2 -> {
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > array[i - 1]) {
                        int temp = array[i];
                        int j;
                        for (j = i - 1; j >= 0 && array[j] < temp; j--) {
                            array[j + 1] = array[j];
                        }
                        array[j + 1] = temp; // 将temp赋值给array[j + 1]是因为j会多自减一次
                    }
                }
            }
            default -> System.out.println("选择错误，请重新选择");
        }
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

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.printf("%d ", i);
        }
    }
}
