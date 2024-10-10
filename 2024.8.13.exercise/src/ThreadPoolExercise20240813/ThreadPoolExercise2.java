package ThreadPoolExercise20240813;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPoolExercise2 {
    public static void main(String[] args) {
        // static ExecutorService newFixedThreadPool(int nThread)  创建一个指定最多线程数的线程池

        // 参数不是初始值而是最大值
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        // 如此处参数传递10，并非是线程的初始数目就是10，而是线程池中的最大线程数是10

        ThreadPoolExecutor pool = (ThreadPoolExecutor) executorService;
        System.out.println(pool.getPoolSize()); //0
        // 可见最开始创建线程池，线程池中的线程是0

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        executorService.submit(()->{
            System.out.println(Thread.currentThread().getName() + "在执行了");
        });

        System.out.println(pool.getPoolSize()); //2
        executorService.shutdown();

    }
}
