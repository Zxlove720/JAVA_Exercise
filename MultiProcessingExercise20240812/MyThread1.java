package MultiProcessingExercise20240812;

public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<= 100; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
