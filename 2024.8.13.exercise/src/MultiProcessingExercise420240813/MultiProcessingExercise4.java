package MultiProcessingExercise420240813;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiProcessingExercise4 {
    public static void main(String[] args) {
        // 抢红包，红包金额是共享数据，100块分为3个红包，5个人抢
        TakeMoney takeMoney = new TakeMoney();

        Thread thread1 = new Thread(takeMoney, "张三");
        Thread thread2 = new Thread(takeMoney, "李四");
        Thread thread3 = new Thread(takeMoney, "王五");
        Thread thread4 = new Thread(takeMoney, "赵六");
        Thread thread5 = new Thread(takeMoney, "钱七");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
