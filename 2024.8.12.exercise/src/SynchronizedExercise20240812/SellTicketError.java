package SynchronizedExercise20240812;

public class SellTicketError implements Runnable{
    // 这是错误的写法
    static int tickets =  100;
    @Override
    public void run() {
        while(true) {
            if (tickets <= 0) {
                break;
            }else {
                try{
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                tickets--;
                System.out.println(Thread.currentThread().getName() + ": 正在卖第" + (100 - tickets) + "张票");
            }
        }
    }
}
