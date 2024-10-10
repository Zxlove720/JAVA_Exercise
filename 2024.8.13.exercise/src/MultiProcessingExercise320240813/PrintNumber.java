package MultiProcessingExercise320240813;

import java.util.concurrent.locks.ReentrantLock;

public class PrintNumber implements Runnable {
    private ReentrantLock lock = new ReentrantLock();
    private int number = 1;
    @Override
    public void run() {
        while (number < 100) {
            lock.lock();
            try {
                if (number < 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (number % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                    }
                    number++;
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
