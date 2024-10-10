package SortExercise20240723;
public class InsertSort {
    public static void main(String[] args) {
        int[] array = Sorts.creatArray();
        Sorts.insertSort(array);
        Sorts.printArray(array);
    }
}

