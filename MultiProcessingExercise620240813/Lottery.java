package MultiProcessingExercise620240813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

public class Lottery implements Runnable {
    private ArrayList<Integer> pool;
    public Lottery(ArrayList<Integer> pool) {
        this.pool = pool;
    }
    private final ReentrantLock lock = new ReentrantLock();

    private ArrayList<Integer> list1 = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            if (pool.isEmpty()) {
                // 此时抽奖箱已经空了，停止抽奖，开始输出每个抽奖箱的结果
                if ("抽奖箱1".equals(Thread.currentThread().getName())) {
                    System.out.println("抽奖箱1：" + list1);
                } else {
                    System.out.println("抽奖箱2：" + list2);
                }
                lock.unlock();
                break;
            } else {
                // 此时抽奖箱不空，继续抽奖
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    Collections.shuffle(pool);
                    int prize = pool.removeFirst();
                    if ("抽奖箱1".equals(Thread.currentThread().getName())) {
                        if (prize != 0) {
                            list1.add(prize);
                        }
                    } else {
                        if (prize != 0) {
                            list2.add(prize);
                        }
                    }
                } finally {
                    lock.unlock();
                }
            }
        }
    }
}




