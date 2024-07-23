package SortExercise20240723;
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = Sorts.creatArray();
        Sorts.bubbleSort(array);
        Sorts.printArray(array);
    }
}
