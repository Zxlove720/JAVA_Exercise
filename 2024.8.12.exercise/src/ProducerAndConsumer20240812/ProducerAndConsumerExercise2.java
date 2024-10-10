package ProducerAndConsumer20240812;

public class ProducerAndConsumerExercise2 {
    public static void main(String[] args) {
        /* 案例需求:
           桌子类(Desk)：定义表示汉堡包数量的变量,定义锁对象变量,定义标记桌子上有无汉堡包的变量
           生产者类(Cooker)：实现Runnable接口，重写run()方法，设置线程任务:
           1.判断是否有汉堡包,决定当前线程是否执行
           2.如果有汉堡包,就进入等待状态,如果没有汉堡包,继续执行,生产汉堡包
           3.生产汉堡包之后,更新桌子上汉堡包状态,唤醒消费者消费汉堡包
           消费者类(Foodie)：实现Runnable接口，重写run()方法，设置线程任务:
           1.判断是否有汉堡包,决定当前线程是否执行
           2.如果没有汉堡包,就进入等待状态,如果有汉堡包,就消费汉堡包
           3.消费汉堡包后,更新桌子上汉堡包状态,唤醒生产者生产汉堡包
           测试类(Demo)：里面有main方法，main方法中的代码步骤如下:
           创建生产者线程和消费者线程对象
           分别开启两个线程
        */

        Cook cook = new Cook();
        Foodie foodie = new Foodie();

        Thread thread1 = new Thread(cook, "厨师");
        Thread thread2 = new Thread(foodie, "顾客");

        thread1.start();
        thread2.start();
    }
}
