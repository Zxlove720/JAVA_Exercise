package MultiProcessingExercise120240813;

public class MultiProcessingExercise {
    public static void main(String[] args) {
        /*
        需求：
          一共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒,
          请用多线程模拟卖票过程并打印剩余电影票的数量
        */

        SellTicketsPro sellTicketsPro = new SellTicketsPro();

        Thread thread1 = new Thread(sellTicketsPro, "窗口1");
        Thread thread2 = new Thread(sellTicketsPro, "窗口2");

        thread1.start();
        thread2.start();

    }
}
