package MultiProcessingExercise20240812;

public class MultiProcessingExercise3 {
    public static void main(String[] args) {
        // 线程的优先级
        // 两种调度线程的方式
        // 1.分时调度模型：所有CPU轮流使用CPU，平均分配每个线程占用CPU的时间片
        // 2.抢占式调度模型：优先让优先级高的线程使用CPU，若优先级相同，则随机选择；但是这并不绝对，只是优先级高的线程获取的CPU时间片相对较多

        // Java使用的是抢占式调度模型
        // 随机性：
        // 假如计算机只有一个CPU，那么CPU在某一个时刻只能执行一条指令，线程只有得到CPU时间片，也就是使用权，才可以执行指令
        // 所以说多线程程序的执行是有随机性，因为谁抢到CPU的使用权是不一定的（优先级高的抢占到CPU时间片概率高）

        // 优先级相关方法
        // final int getPriority() 返回该线程的优先级
        // final void setPriority(int newPriority) 更改该线程的优先级，默认是5，优先级的更改范围为1-10

        MyThread1 myThread1 = new MyThread1();
        MyThread1 myThread2 = new MyThread1();

        // 发现两个线程的默认优先级是5
//        System.out.println(myThread1.getPriority());
//        System.out.println(myThread2.getPriority());

        // 设置两个线程的优先级
        myThread1.setPriority(1);
        myThread2.setPriority(10);

        myThread1.setName("线程1");
        myThread2.setName("线程2");

        myThread1.start();
        myThread2.start();

        // 即使线程2的优先级远高于线程1，但是线程优先级只是概率问题，并不绝对，所以说有时线程1会比线程2先执行完毕，但是这只是小部分情况

    }
}
