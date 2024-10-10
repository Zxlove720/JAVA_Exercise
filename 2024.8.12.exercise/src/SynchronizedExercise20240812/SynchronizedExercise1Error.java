package SynchronizedExercise20240812;

public class SynchronizedExercise1Error {
    // 错误的写法
    public static void main(String[] args) {
        /* 需求：某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票 */

        SellTicketError st = new SellTicketError();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();

        // 发现有两个问题：1.不同的窗口在卖同一张票
        //                2.有窗口卖了不存在的票

        // 问题原因：线程执行的随机性导致的，窗口线程在卖票的时候丢失了CPU执行权（如sleep方法），导致出现了问题
    }
}
