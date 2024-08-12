package SynchronizedExercise20240812;

public class SellTicketsPro implements Runnable{
    private static int tickets = 100; // 必须用static修饰票数：即使有多个SellTickets对象，也是共享这100张票
    private static final Object lock = new Object(); // 必须用static修饰锁对象，即使有多个SellTickets对象，也共享这一把锁
    @Override
    public void run() {
        while(true) {
            synchronized (lock) {
                // 将操作共享数据的代码用synchronized锁起来
                // 假如Thread1抢到CPU资源，那么就进入锁，并且将synchronized锁起来
                if (tickets > 0) {
                    try{
                        Thread.sleep(100);
                        // Thread1就算进入sleep状态，因为存在锁，CPU资源也不会被其他线程抢走
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (100 - tickets) + "张票");
                } else {
                    return;
                }
            }
            // Thread1到此处才会释放锁，然后又回到线程抢占CPU资源的操作
        }
    }
}
