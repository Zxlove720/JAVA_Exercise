package DaemonExercise20240812;

public class DaemonExercise {
    public static void main(String[] args) {
        // 守护线程
        // 当普通线程执行完毕之后，守护线程没有继续执行的必要，所以说会逐步关闭（并非瞬间关闭）

        // 作用：主要是在后台执行一些辅助任务
        // 1.后台任务执行：守护线程通常用于执行一些不需要用户干预的后台任务，例如日志记录、系统监控等。所以说当主线程退出，不需要监控了，则守护线程也退出
        // 2.垃圾回收：在Java中垃圾回收是经典的守护线程，在后台运行，自动回收不再使用的后台资源，提高程序运行效率

        // void setDaemon(boolean on) 将此线程标记为守护线程，若运行的线程都是守护线程，JVM退出

        MyThread1 myThread1 = new MyThread1();
        MyThread3 myThread3 = new MyThread3();
        MyThread2 myThread2 = new MyThread2(); // 该线程是守护线程

        // 设置守护线程
        myThread2.setDaemon(true);
        myThread1.setName("线程1");
        myThread2.setName("线程2");
        myThread3.setName("线程3");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        // 可见，当普通线程全部执行完成之后，守护线程逐步关闭
        // 若守护线程已经执行完毕，但是还有普通线程还在执行，那么守护线程关闭不会影响其他线程的执行
    }
}
