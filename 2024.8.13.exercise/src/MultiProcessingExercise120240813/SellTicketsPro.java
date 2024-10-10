package MultiProcessingExercise120240813;

import java.util.concurrent.locks.ReentrantLock;

public class SellTicketsPro implements Runnable {
    private static int tickets = 1000;
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (tickets > 0) {
            lock.lock();
            try {
                if (tickets > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (1000 - tickets) + "张票");
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
