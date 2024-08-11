package MultiProcessingExercise20240811;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MultiProcessingExercise3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 多线程的实现方法
        // 3.实现Callable接口
        // 定义一个类实现Callable接口
        // 在实现类中重写call()方法
        // 创建实现类对象
        // 创建Future的实现类FutureTask对象，将Callable实现类的对象作为构造方法的参数
        // 创建Thread类对象，将FutureTask对象作为构造方法的参数，并启动线程
        // 再调用FutureTask的get方法，可以得到线程结束之后的结果

        MyThread3 callable1 = new MyThread3();
        MyThread3 callable2 = new MyThread3();
        FutureTask<Integer> ft1 = new FutureTask<>(callable1);
        FutureTask<Integer> ft2 = new FutureTask<>(callable2);

        Thread t1 = new Thread(ft1, "线程1");
        Thread t2 = new Thread(ft2, "线程2");

        t1.start();
        t2.start();

        System.out.println(ft1.get());
        System.out.println(ft2.get());
    }
}
