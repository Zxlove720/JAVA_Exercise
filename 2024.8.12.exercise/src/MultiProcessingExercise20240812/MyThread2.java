package MultiProcessingExercise20240812;

public class MyThread2  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName() + "成功抢到CPU资源"); // 每一行语句后线程都会抢占CPU资源
            System.out.println(getName() + ": " + i);
        }

    }
}
