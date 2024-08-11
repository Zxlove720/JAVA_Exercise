package MultiProcessingExercise20240811;

public class MultiProcessingExercise2 {
    public static void main(String[] args) {
        // 多线程的实现方法
        // 2.实现Runnable接口
        // 定义一个类实现Runnable接口
        // 在实现类中重写run方法
        // 创建实现类对象并将实现类对象作为Thread构造方法的参数

        // Thread的构造方法
        // Thread(Runnable target) 分配一个新的Thread对象
        // Thread(Runnable target, String name) 分配一个新的Thread对象

        // 创建Runnable实现类对象
        MyThread2 runnable1 = new MyThread2();
        MyThread2 runnable2 = new MyThread2();
        // 为其取名
        runnable1.setName("线程1");
        runnable2.setName("线程2");
        // 通过Thread的构造方法创建线程
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);
        // 用start方法开启线程
        thread1.start();
        thread2.start();
        // 注：因为用Runnable实现类来创建线程没有继承Thread类，所以说不能直接使用set和get方法
        // 但是可以使用Thread中的currentThread方法来得到线程，然后再调用set和get方法
    }
}
