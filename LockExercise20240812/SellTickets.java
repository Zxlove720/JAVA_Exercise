package LockExercise20240812;

import java.util.concurrent.locks.ReentrantLock;

public class SellTickets implements Runnable {
    private static int tickets = 100;
    private static ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (tickets <= 0) {
                    break;
                } else {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    tickets--;
                    System.out.println(Thread.currentThread().getName() + ": 正在卖第" + (100 - tickets) + "张票");
                }
            } finally {
                lock.unlock();
            }
        }
    }
}


//package LockExercise20240812;
//
//import java.util.concurrent.locks.ReentrantLock;
//
//public class SellTickets implements Runnable {
//    private static int tickets = 100;
//    private static ReentrantLock lock = new ReentrantLock();
//
//    @Override
//    public void run() {
//        while (true) {
//            lock.lock();
//            if (tickets <= 0) {
//                return;
//            } else {
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                tickets--;
//                System.out.println(Thread.currentThread().getName() + ": 正在卖第" + (100 - tickets) + "张票");
//            }
//            lock.unlock();
//        }
//    }
//}

// 将unlock方法写在了if - else之外，假如tickets的值小于等于0，线程会直接返回而不会释放锁，
// 这可能导致其他线程无法获取锁（因为其他线程已经进入循环了，在等待那把锁，假如一直没有就会陷入死锁状态）从而进入死锁状态
