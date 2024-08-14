package MultiProcessingExercise120240814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;

public class Lottery implements Runnable{
    // 创建奖池
    private ArrayList<Integer> pool;
    // 构造方法初始化奖池
    public Lottery(ArrayList<Integer> pool) {
        this.pool = pool;
    }
    // 创建两个抽奖箱便于统计两个抽奖箱的奖项
    private ArrayList<Integer> list1 = new ArrayList<>();
    private ArrayList<Integer> list2 = new ArrayList<>();
    // 创建锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (pool.isEmpty()) {
                    // 此时已经奖池已经空了，所以说抽奖完成，可以输出了
                    int maxAward1 = Collections.max(list1);
                    int maxAward2 = Collections.max(list2);
                    if ("抽奖箱1".equals(Thread.currentThread().getName())) {
                        System.out.println(Thread.currentThread().getName() + "中的最大奖是" + maxAward1);
                        System.out.println(Thread.currentThread().getName() + ": " + list1);
                    } else {
                        System.out.println(Thread.currentThread().getName() + "中的最大奖是" + maxAward2);
                        System.out.println(Thread.currentThread().getName() + ": " + list2);
                    }
                    if (maxAward1 > maxAward2) {
                        System.out.println("抽奖箱1有更大的奖项————" + maxAward1);
                    } else {
                        System.out.println("抽奖箱2有更大的奖项————" + maxAward2);
                    }
                    break;
                } else {
                    // 此时奖池还没空，继续抽奖
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    Collections.shuffle(pool);
                    int prize = pool.removeFirst();
                    if (prize != 0) {
                        if (Thread.currentThread().getName().equals("抽奖箱1")) {
                            list1.add(prize);
                        } else {
                            list2.add(prize);
                        }
                    }
                }
            } finally {
                lock.unlock();
            }
        }
    }
}


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.concurrent.locks.ReentrantLock;
//
//public class Lottery implements Runnable {
//    private ArrayList<Integer> pool;
//    private ArrayList<Integer> list1 = new ArrayList<>();
//    private ArrayList<Integer> list2 = new ArrayList<>();
//    private final ReentrantLock lock = new ReentrantLock();
//
//    public Lottery(ArrayList<Integer> pool) {
//        this.pool = pool;
//    }
//
//    @Override
//    public void run() {
//        while (true) {
//            lock.lock();
//            try {
//                if (pool.isEmpty()) {
//                    break;
//                }
//                Collections.shuffle(pool);
//                int prize = pool.removeFirst();
//                if (Thread.currentThread().getName().equals("抽奖箱1")) {
//                    list1.add(prize);
//                } else {
//                    list2.add(prize);
//                }
//            } finally {
//                lock.unlock();
//            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//
//        lock.lock();
//        try {
//            int maxAward1 = list1.isEmpty() ? 0 : Collections.max(list1);
//            int maxAward2 = list2.isEmpty() ? 0 : Collections.max(list2);
//            if ("抽奖箱1".equals(Thread.currentThread().getName())) {
//                System.out.println(Thread.currentThread().getName() + "中的最大奖是" + maxAward1);
//                System.out.println(Thread.currentThread().getName() + ": " + list1);
//            } else {
//                System.out.println(Thread.currentThread().getName() + "中的最大奖是" + maxAward2);
//                System.out.println(Thread.currentThread().getName() + ": " + list2);
//            }
//            if (maxAward1 > maxAward2) {
//                System.out.println("抽奖箱1有更大的奖项————" + maxAward1);
//            } else {
//                System.out.println("抽奖箱2有更大的奖项————" + maxAward2);
//            }
//        } finally {
//            lock.unlock();
//        }
//    }
//}

