package BlockingQueueExercise20240812;

import java.util.concurrent.ArrayBlockingQueue;

public class BlockingQueueExercise1 {
    public static void main(String[] args) throws InterruptedException {
        // 阻塞队列

        // 队列有大量的继承结构，其中常见的是BlockingQueue，其是一个接口，需要用其实现类
        // ArrayBlockingQueue
        // 其底层是数组，有界
        // LinkedBlockingQueue
        // 其底层是链表，理论上有界，为int的最大值，实际上无界（硬件不支持这么大的队列）

        // BlockingQueue中的核心方法
        // put(Object obj) 将参数放入队列，若无法放入（队列已满），则会陷入阻塞
        // take() 取出队列中的（先进先出）第一个数据，若取不到（队列为空），则会陷入阻塞
        // 创建阻塞队列的对象,容量为 1

        // 构造方法
        // ArrayBlockingQueue(int capacity) 创建一个大小为capacity的ArrayBlockQueue
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<>(2);

        // 存储元素
        arrayBlockingQueue.put("烧花鸭");
        arrayBlockingQueue.put("烧雏鸡");


        // 取元素
        System.out.println(arrayBlockingQueue.take());
        System.out.println(arrayBlockingQueue.take());
        // 取不到会阻塞，所以说下面的代码不会执行，会一直阻塞在此处
        System.out.println("程序结束了");
        // 假如阻塞队列容量不足，但又往里面放东西，则也会阻塞
    }
}
