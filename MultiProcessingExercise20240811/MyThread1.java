package MultiProcessingExercise20240811;

public class MyThread1 extends Thread{
    // void run() 在线程开启之后，该方法被调用执行（该方法就是该线程的核心逻辑）
    @Override
    public void run() {
        // 打印数字
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + ": " + i);
        }
    }
}
