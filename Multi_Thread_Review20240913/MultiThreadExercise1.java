package Multi_Thread_Review20240913;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class MultiThreadExercise1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        /*
        * 并发：单个CPU同时处理多个指令
        * 并行：多个CPU同时处理多个指令
        * */

        /*
        *  进程：正在运行的程序
        *  进程的独立性：进程是一个能够独立运行的基本单位，同时也是系统动态分配资源和调度的独立单位
        *  进程的动态性：进程的实质是程序的一次执行的过程，是动态产生，动态消亡的
        *  进程的并发性：任何进程都可以和其他进程并发执行
        *
        *
        *  线程：是进程中的单个顺序的控制流，是一条执行路径
        *  单线程：若一个进程只有一条执行路径，那么称为单线程程序
        *  多线程：若一个进程有多个执行路径，那么称为多线程程序
        *
        *
        * */

        /* 继承Thread类实现多线程 */
//        My_Thread1 myThread = new My_Thread1();
//        myThread.setName("A线程");
//        My_Thread1 myThread1 = new My_Thread1();
//        myThread1.setName("B线程");
//        myThread.start();
//        myThread1.start();
//
//        /* 实现Runnable接口实现多线程 */
//        My_Runnable myRunnable1 = new My_Runnable();
//        Thread thread1 = new Thread(myRunnable1);
//        thread1.setName("A线程");
//        Thread thread2 = new Thread(myRunnable1);
//        thread2.setName("B线程");
//        thread1.start();
//        thread2.start();

        /* 实现callable接口实现多线程 */
        /* FutureTask 是一个一次性任务，一旦一个线程开始执行它，其他线程就无法再执行同一个任务了 */
        My_Callable myCallable = new My_Callable();
        FutureTask future = new FutureTask(myCallable);
        Thread thread3 = new Thread(future);
        Thread thread4 = new Thread(future);
        thread3.setName("线程A");
        thread4.setName("线程B");
        thread3.start();
        thread4.start();
        System.out.println(future.get());


    }
}
