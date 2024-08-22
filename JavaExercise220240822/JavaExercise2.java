package JavaExercise220240822;

import java.util.Scanner;

public class JavaExercise2 {
    public static void main(String[] args) {
        int[] array = creatArray();
        chooseSort(array);
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

    // 选择排序
    public static void chooseSort(int[] array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择升序还是降序");
        System.out.println("1.升序     2.降序");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                for (int i = 0; i < array.length; i++) {
                    int min = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] < array[min]) {
                            min = j;
                        }
                    }
                    if (min != i) {
                        int temp = array[min];
                        array[min] = array[i];
                        array[i] = temp;
                    }
                }
            }
            case 2 -> {
                for (int i = 0; i < array.length; i++) {
                    int max = i;
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[j] > array[max]) {
                            max = j;
                        }
                    }
                    if (max != i) {
                        int temp = array[max];
                        array[max] = array[i];
                        array[i] = temp;
                    }
                }
            }
            default -> System.out.println("选择错误，请重新选择");
        }
    }
}
