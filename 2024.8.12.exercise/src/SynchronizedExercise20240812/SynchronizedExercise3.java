package SynchronizedExercise20240812;

public class SynchronizedExercise3 {
    public static void main(String[] args) {
        // 同步方法解决数据安全问题
        // 同步方法：将synchronized关键字加到方法上，使得该方法变成同步方法，其作用和同步代码块是相同的
        // 修饰符 synchronized 返回值类型 方法名(参数) {
        //        方法体;
        // }

        // 同步方法的方法锁的对象————>this
        SellTicketMethod stm = new SellTicketMethod();

        Thread thread1 = new Thread(stm, "窗口1");
        Thread thread2 = new Thread(stm, "窗口2");
        Thread thread3 = new Thread(stm, "窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
