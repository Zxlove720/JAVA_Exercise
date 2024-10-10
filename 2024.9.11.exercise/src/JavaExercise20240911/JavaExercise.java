package JavaExercise20240911;

public class JavaExercise {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);  // 递归排序左半部分
            quickSort(arr, pi + 1, high); // 递归排序右半部分
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 选择最后一个元素作为基准
        int i = (low - 1); // 较小元素的索引
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                // 交换arr[i]和arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // 交换arr[i+1]和arr[high] (或pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;
        quickSort(arr, 0, n - 1);
        System.out.println("排序后的数组:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
