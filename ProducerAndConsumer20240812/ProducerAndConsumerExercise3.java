package ProducerAndConsumer20240812;

public class ProducerAndConsumerExercise3 {
    public static void main(String[] args) {
        // 需求：
        /* 将Desk类中的变量,采用面向对象的方式封装起来
           生产者和消费者类中构造方法接收Desk类对象,之后在run方法中进行使用
           创建生产者和消费者线程对象,构造方法中传入Desk类对象
           开启两个线程
           */

        DeskPro deskPro = new DeskPro();

        CookPro cookPro = new CookPro(deskPro);
        FoodiePro foodiePro = new FoodiePro(deskPro);

        Thread thread1 = new Thread(cookPro, "厨师");
        Thread thread2 = new Thread(foodiePro, "顾客");

        thread1.start();
        thread2.start();

    }
}
