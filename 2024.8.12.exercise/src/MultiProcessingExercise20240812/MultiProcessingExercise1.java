package MultiProcessingExercise20240812;

public class MultiProcessingExercise1 {
    public static void main(String[] args) {
        // 设置、获取线程名称
        // 如果使用继承Thread类的方式实现多线程，那么可以直接通过set和get方法进行设置和获取线程名称
        MyThread1 thread1 = new MyThread1(); // 这个类是直接继承的Thread类，可以直接用set和get方法
        thread1.setName("线程1");
        MyThread1 thread2 = new MyThread1(); // 这个类是直接继承的Thread类，可以直接用set和get方法
        thread2.setName("线程2");
        // 开启两条线程，发现多线程的set和get方法成功实现
        thread1.start();
        thread2.start();

        // 若不是用的直接继承Thread类实现多线程，那么则不能直接用set和get方法（不建议在实现类中写set和get方法）
        // 可以使用Thread中的静态方法：currentThread————返回对当前正在执行的线程对象的引用，然后再使用set和get方法

        // 用实现Runnable类创建Thread对象
        MyRunnable runnable1 = new MyRunnable();
        MyRunnable runnable2 = new MyRunnable();
        Thread thread3 = new Thread(runnable1, "线程3"); // 可以用构造方法给线程命名（相当于set方法了）
        Thread thread4 = new Thread(runnable2, "线程4");
        thread3.start();
        thread4.start();

        // 注：四条线程一起抢占CPU资源
    }
}
