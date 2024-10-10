package MultiProcessingExercise220240813;

import java.util.concurrent.locks.ReentrantLock;

public class GIft implements Runnable {
    private int gifts = 100;
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (gifts > 10) {
            // 当剩下的礼物还大于10就还可以送礼物
            lock.lock();
            try {
                if (gifts > 10) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    gifts--;
                    System.out.println(Thread.currentThread().getName() + "正在送第" + (100 - gifts) + "份礼物");
                }
            } finally {
                lock.unlock();
            }
        }
    }
}


//import java.util.concurrent.locks.ReentrantLock;
//
//public class GIft implements Runnable {
//    private static int gifts = 100;
//    private static final ReentrantLock lock = new ReentrantLock();
//
//    @Override
//    public void run() {
//        try {
//            while (gifts > 10) {
//                // 当剩下的礼物还大于10就还可以送礼物
//                lock.lock();
//                if (gifts > 10) {
//                    try {
//                        Thread.sleep(10);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    gifts--;
//                    System.out.println(Thread.currentThread().getName() + "正在送第" + (100 - gifts) + "份礼物");
//                }
//            }
//        } finally {
//            lock.unlock();
//        }
//    }
//}
