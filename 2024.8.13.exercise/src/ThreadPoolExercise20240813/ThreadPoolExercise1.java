package ThreadPoolExercise20240813;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExercise1 {
    public static void main(String[] args) throws InterruptedException {
        // 线程池
        // 线程池，顾名思义，就像一个水池，水池中存储了大量的水；而线程池中可以存储大量的线程

    /* 线程池的意义：
       系统创建一个线程的成本相对较高，其涉及到与操作系统的交互，当程序中需要创建大量生命周期短暂的线程时
       频繁的创建和销毁线程对于系统的资源是极大的消耗，甚至可能大于业务本身对于资源的消耗。所以说针对这种大量创建线程的
       情况，就可以使用线程池————线程池在启动时就会创建大量的空闲线程，当向线程池提交任务时（需要线程来完成这个任务），
       线程池就会启动池内的一个线程来执行该任务，等待任务执行完成之后，线程并非直接死亡，而是再次返回线程池中，再次变为
       空闲状态，等待下一次任务的执行（再一次申请线程执行任务） */

        // 总结而言，线程池的意义主要是在于减少了线程的重复创建，通过线程池，线程可以重复利用，提高了效率

        // 设计思路：
        // 1.准备一个任务容器；
        // 2.一次性启动多个（至少2个）消费者线程
        // 3.刚开始任务容器是空的，所以说所有线程都是wait状态
        // 4.直到外部线程向任务容器中添加一个“任务”，就有一个消费者线程被唤醒来执行这个任务
        // 5.消费者线程在任务容器中“取出”这个任务，然后执行这个任务，执行完毕后，继续等待下个任务

        // Executors默认线程池
        // JDK对线程池有默认实现————Executors默认线程池，其实真实开发中也很少自定义线程池，大部分情况都是使用JDK默认线程池

        // 创建线程池
        // Executors静态方法创建
        // static ExecutorsService newCachedThreadPool()  创建一个默认的线程池
        // static newFixedThreadPool(int nThread)  创建一个指定最多线程数量的线程池

        // 创建一个默认的线程池对象，默认是空的，默认最多可以容纳int类型的最大值的线程（理论有限、实际无限）
        ExecutorService executorService = Executors.newCachedThreadPool();
        // Executors ———— 可以帮助创建默认线程池对象
        // ExecutorService ———— 可以帮助控制线程池
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "正在执行");
            }
        });

        //Thread.sleep(2000);

        executorService.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "正在执行");
            }
        });

        // 调用shutdown方法关闭线程池
        executorService.shutdown();
        /* 注：假如在两个任务提交的间隔加入sleep方法，线程池中只会有一条线程被使用，因为在sleep的时候，执行任务1的线程1已经执行
        完毕并返回线程池处于空闲状态，当任务2提交后，线程1处于空闲状态，所以说还是由线程1执行的任务2 */

    }
}
