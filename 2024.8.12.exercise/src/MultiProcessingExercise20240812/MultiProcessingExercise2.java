package MultiProcessingExercise20240812;

public class MultiProcessingExercise2 {
    public static void main(String[] args) {
        // 线程休眠
        // static void sleep(long millis) 使当前正在执行的线程停留（暂停执行）指定的毫秒数

        // 意义：主要是为了出让线程占用的CPU资源，让其他线程有机会执行，从而实现线程之间的轮换调用

        // 作用：
        // 1.假如某个任务需要等待资源准备（硬盘和内存的问题和CPU无关），通过线程休眠，可以避免CPU空转
        // 2.通过让线程休眠，避免某个线程长时间的占用CPU资源，从而降低CPU负载
        // 3.配合其他同步机制，线程休眠可以实现复杂的线程同步机制
        // 其作用主要是从效率和需求方面进行考虑的

        MyThread2 myThread1 = new MyThread2();
        MyThread2 myThread2 = new MyThread2();

        myThread1.setName("线程1");
        myThread2.setName("线程2");

        myThread1.start();
        myThread2.start();
    }
}
