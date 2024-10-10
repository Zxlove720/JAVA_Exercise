package MultiProcessingExercise120240813;

public class SellTickets implements Runnable {
    private static int tickets = 100;
    private static final Object lock = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized(lock) {
                if (tickets == 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + (100 - tickets) + "张票");
                }
            }
        }
    }
}
