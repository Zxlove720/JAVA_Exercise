package SortExercise20240723;
public class QuickSort {
    public static void main(String[] args) {
        int[] array = Sorts.creatArray();
        int low = 0;
        int high = array.length - 1;
        Sorts.choiceQuickSort(array, low, high);
        Sorts.printArray(array);
    }
}
