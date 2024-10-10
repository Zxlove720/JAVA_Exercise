package LockExercise20240812;

public class LockExercise {
    public static void main(String[] args) {
        // Synchronized同步代码块或同步方法通过锁对象解决了数据安全的问题，但是并没有清晰的看见在何处上锁和解锁，
        // 所以说在JDK5之后提供了一个新的锁对象Lock，可以清晰地表达如何上锁和解锁

        // Lock是一个接口，不能直接实例化，可以通过其实现类ReentrantLock进行实例化

        // ReentrantLock() 创建一个ReentrantLock对象
        // void lock() 上锁
        // void unlock() 解锁

        SellTickets st = new SellTickets();

        Thread thread1 = new Thread(st, "窗口1");
        Thread thread2 = new Thread(st, "窗口2");
        Thread thread3 = new Thread(st, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
