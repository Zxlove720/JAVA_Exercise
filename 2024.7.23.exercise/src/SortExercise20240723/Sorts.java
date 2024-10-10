package SortExercise20240723;
import java.util.Scanner;
public class Sorts {
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
    // 冒泡排序为什么内层循环需要从0索引开始：因为外层循环每一次会将一个最大或者最小的元素“冒泡”到元素的末尾，相当于是后面有序，前面无序
    // 所以说冒泡排序需要从0索引开始，而且内层循环中j < array.length - i - 1中，之所以要-i，是因为每次外循环（也就是i控制）都会将一个
    // 元素在末尾排序，经过i次外循环，数组末尾已经有i个元素是有序的了，所以说内循环可以-i，从而提高效率


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
    /* 选择排序的核心是选择，根据升序和降序的不同要求，每次选择一个最小值或者最大值放在数组的前面（相当于排序过程中，i的前面是有序的）
       注意，min和max记录的应该是索引，而并非对应的元素值，否则在比较和交换的时候，会出错，并且会导致选择排序的逻辑混乱 */


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
