package MultiProcessingExercise320240813;

public class MultiProcessingExercise {
    public static void main(String[] args) {
        // 需求：同时开启两个线程，共同获取1 - 100之间的所有数字，若是奇数则打印
        PrintNumber printNumber = new PrintNumber();

        Thread thread1 = new Thread(printNumber, "线程1");
        Thread thread2 = new Thread(printNumber, "线程2");

        thread1.start();
        thread2.start();
    }
}
