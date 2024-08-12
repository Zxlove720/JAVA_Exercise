package SynchronizedExercise20240812;

public class SynchronizedExercise2 {
    public static void main(String[] args) {
        // 数据安全问题出现的条件
        // 1.具备多线程环境（线程执行的随机性导致，一条线程并未执行完毕，在执行过程中丢失了CPU执行权，导致问题）
        // 2.具有共享的数据
        // 3.有多条语句操作共享数据

        // 用同步代码块解决数据安全问题
        // 思想：将多条语句操作共享数据的代码锁起来，让同一时刻只能有一个线程执行
        // Java提供了同步代码块方式来解决此类问题

        // synchronized(任意对象) {
        //      多条语句操作共享数据的代码
        // }

        SellTicketsPro st1 = new SellTicketsPro();
        SellTicketsPro st2 = new SellTicketsPro();
        SellTicketsPro st3 = new SellTicketsPro();

        Thread thread1 = new Thread(st1, "窗口1");
        Thread thread2 = new Thread(st2, "窗口2");
        Thread thread3 = new Thread(st3, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
