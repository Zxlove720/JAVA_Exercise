package JavaExercise20240904;

public class JavaExercise {
    public static void main(String[] args) {
        int[] arr = {99, 55, 2, 3, 9, 10, 22, 34, 67, 89, 69, 92, 101, 102};
        shellSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void shellSort(int[] array) {
        int n = array.length;
        // 初始增量为数组长度的一半，然后逐步减小增量
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 从第gap个元素开始，逐个对其所在组进行直接插入排序
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                array[j] = temp;
            }
        }
    }
}
