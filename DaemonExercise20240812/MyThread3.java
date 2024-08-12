package DaemonExercise20240812;

public class MyThread3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i<= 40; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
