package ProducerAndConsumer20240812;

public class ProducerAndConsumerExercise1 {
    public static void main(String[] args) {
        // 生产者（Producer）和消费者（Consumer）模式
        // 这是一个十分经典的多线程协作模式，其主要包含了两类线程

        // 1.生产者线程：用于生产数据（提供给消费者数据）
        // 2.消费者线程：用于消费数据（使用生产者的数据）

        // 实现生产者和消费者的关系，通常采用共享的数据区域；生产者将数据直接放置于共享数据区中，无需关心消费者的行为
        //                                              而消费者若需要则直接去共享数据区获取数据，无需关系生产者的行为

        // Object类中的等待和唤醒方法
        // void wait() 使当前线程进入等待，知道另一个线程调用该对象的notify()方法或notifyAll()方法
        // void notify() 唤醒正在等待对象监视器的单个线程
        // void notifyAll() 唤醒正在等待对象监视器的全部线程
    }
}
