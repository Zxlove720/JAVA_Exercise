package MultiProcessingExercise520240813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

public class Lottery implements Runnable{
    // 创建奖池
    private ArrayList<Integer> pool;
    // 用构造方法来为奖池中加入奖品
    public Lottery(ArrayList<Integer> pool) {
        this.pool = pool;
    }
    // 创建锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (!pool.isEmpty()) {
            lock.lock();
            try {
                if (pool.isEmpty()) {
                    break;
                }
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                // 将奖池打乱顺序
                Collections.shuffle(pool);
                int prize = pool.removeFirst();
                if (prize == 0) {
                    System.out.println(Thread.currentThread().getName() + "没有获奖");
                } else {
                    System.out.println(Thread.currentThread().getName() + "产生了一个" + prize + "元的奖项");
                }
            } finally {
                lock.unlock();
            }
        }
    }
}
