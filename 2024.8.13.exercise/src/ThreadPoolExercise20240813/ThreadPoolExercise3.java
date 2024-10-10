package ThreadPoolExercise20240813;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExercise3 {
    public static void main(String[] args) {
        // ThreadPoolExecutor自定义线程池

        // 创建线程池对象
        // ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1.核心线程的数量     int corePoolSize
        //                                                                2.最大线程的数量     int maximumPoolSize
        //                                                                3.空闲线程的最大存活时间     long keepAliveTime
        //                                                                4.时间单位     TimeUnit unit
        //                                                                5.任务队列     BlockingQueue<Runnable> workQueue
        //                                                                6.创建线程工厂     ThreadFactory threadFactory
        //                                                                7.任务的拒绝策略)     RejectedExecutionHandler handler

        // 各个参数的要求：
        // 1.核心线程数量：不能小于0
        // 2.最大线程数量：不能≤0，最大数量≥核心线程数量
        // 3.空闲线程的最大存活时间：不能小于0
        // 4.时间单位：正确的时间单位
        // 5.任务队列：不能为null
        // 6.创建线程工厂：不能为null
        // 7.任务的拒绝策略：不能为null

        // 非默认的任务拒绝策略
        // RejectedExecutionHandler 是JDK提供的一个任务拒绝策略的接口，存在以下子类：
        /*
         ThreadPoolExecutor.AbortPolicy: 		    丢弃任务并抛出RejectedExecutionException异常。是默认的策略。
         ThreadPoolExecutor.DiscardPolicy： 		   丢弃任务，但是不抛出异常 这是不推荐的做法。
         ThreadPoolExecutor.DiscardOldestPolicy：    抛弃队列中等待最久的任务 然后把当前任务加入队列中。
         ThreadPoolExecutor.CallerRunsPolicy:        调用任务的run()方法绕过线程池直接执行。
        */

        /*
         核心线程数量为1 ， 最大线程池数量为3, 任务容器的容量为1 ,空闲线程的最大存在时间为20s
        */
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1 , 3 , 20 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(1) , Executors.defaultThreadFactory() , new ThreadPoolExecutor.AbortPolicy()) ;

        // 线程池最大可执行任务数 = 队列容量 + 最大线程数

        // 提交5个任务，而该线程池最多可以处理4个任务，当我们使用AbortPolicy这个任务处理策略的时候，就会抛出异常
        for(int x = 0 ; x < 5 ; x++) {
            threadPoolExecutor.submit(() -> {
                System.out.println(Thread.currentThread().getName() + "---->> 执行了任务");
            });
        }
        // 一共有4个线程执行了任务，到了第五个任务时，抛出异常
    }
}
