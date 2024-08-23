package JavaExercise220240823;

import java.util.Scanner;

public class SortExercise2 {
    public static void main(String[] args) {
        int[] array = creatArray();
        choiceQuickSort(array, 0, array.length - 1);
        printArray(array);
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

    // 快速排序
    // 升序
    public static int partitionUp(int[] array, int low, int high) {
        int temp = array[low]; // 假定每次在数组最左边的元素为基准元素
        while (low < high) {
            while (low < high && array[high] >= temp) { // 找到第一个比基准元素小的元素
                high--;
            }
            array[low] = array[high]; // 将比基准元素小的移动到low那边去
            while (low < high && array[low] <= temp) { // 找到第一个比基准元素大的元素
                low++;
            }
            array[high] = array[low]; // 将比基准元素大的移动到high那边去
        }
        array[low] = temp; // while循环结束，此时low和high在同一位置，基准元素归位
        return low; // 返回基准元素的位置
    }

    // 降序
    public static int partitionDown(int[] array, int low, int high) {
        int temp = array[low]; // 假定每次在数组最左边的元素为基准元素
        while (low < high) {
            while (low < high && array[high] <= temp) { // 找到第一个比基准元素大的元素
                high--;
            }
            array[low] = array[high]; // 将比基准元素大的移动到low那边去
            while (low < high && array[low] >= temp) { // 找到第一个比基准元素小的元素
                low++;
            }
            array[high] = array[low]; // 将比基准元素小的移动到high那边去
        }
        array[low] = temp; // while循环结束，此时low和high在同一位置，基准元素归位
        return low; // 返回基准元素的位置
    }

    public static void quickSortUp(int[] array, int low, int high) {
        if (low < high) {
            int position = partitionUp(array, low, high);
            quickSortUp(array, low, position - 1); // 递归处理基准元素左边的元素
            quickSortUp(array, position + 1, high); // 递归处理基准元素右边的元素
        }
    }

    public static void quickSortDown(int[] array, int low, int high) {
        if (low < high) {
            int position = partitionDown(array, low, high);
            quickSortDown(array, low, position - 1); // 递归处理基准元素左边的元素
            quickSortDown(array, position + 1, high); // 递归处理基准元素右边的元素
        }
    }

    public static void choiceQuickSort(int[] array, int low, int high) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择升序还是降序");
        System.out.println("1.升序     2.降序");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                quickSortUp(array, low, high);
            }
            case 2 -> {
                quickSortDown(array, low, high);
            }
            default -> System.out.println("选择错误，请重新选择");
        }
    }
}
