package SynchronizedExercise20240812;

public class SellTicketMethod implements Runnable {
    private static int tickets = 100;
    @Override
    public void run() {
        while (true) {
            boolean flag = synchronizedMethod();
            if (!flag) {
                return;
            }
        }
    }

    public synchronized boolean synchronizedMethod() {
        if (tickets <= 0) {
            return false;
        }
        try{
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tickets--;
        System.out.println(Thread.currentThread().getName() + ": 正在卖第" + (100 - tickets) + "张票");
        return true;
    }
}
