package BlockingQueueExercise20240812;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExercise2 {
    public static void main(String[] args) {
        // 阻塞队列实现等待唤醒机制
        // 需求：
        /*  生产者类(Cooker)：实现Runnable接口，重写run()方法，设置线程任务
            1.构造方法中接收一个阻塞队列对象
            2.在run方法中循环向阻塞队列中添加汉堡包
            3.打印添加结果
            消费者类(Foodie)：实现Runnable接口，重写run()方法，设置线程任务
            1.构造方法中接收一个阻塞队列对象
            2.在run方法中循环获取阻塞队列中的汉堡包
            3.打印获取结果
            测试类(Demo)：里面有main方法，main方法中的代码步骤如下
            创建阻塞队列对象
            创建生产者线程和消费者线程对象,构造方法中传入阻塞队列对象
            分别开启两个线程 */

        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(1); // 队列容量为1，确保交替操作
        Cook cook = new Cook(queue);
        Foodie foodie = new Foodie(queue);
        Thread cookThread = new Thread(cook, "厨师");
        Thread foodieThread = new Thread(foodie, "顾客");
        cookThread.start();
        foodieThread.start();
    }
}
