package ThreadPoolExercise20240812;

public class ThreadPoolExercise1 {
    public static void main(String[] args) {
        // 线程状态介绍
        // 当线程被创建并启动之后，并非已启动就进入了执行状态，也并非一直处于执行状态，线程对象在不同的时期有不同的状态

        // 新建状态 NEW：一个尚未启动的线程的状态，也叫初始（开始）状态，线程刚被创建，但并未启动；只有线程对象，但不具备线程的特征

        /* 可运行状态 RUNNABLE：当调用线程对象的start方法之后，线程对象才进入了可运行状态（RUNNABLE），此时才是真正的在JVM中
           创建了一个真正的线程，但是线程一启动，并非直接开始执行，执行与否需要等待CPU的调度，从而将这个中间状态称为可执行状态
           也就是说处于该状态的线程具备执行的资格，但是并没有真正的执行起来，而是在等待CPU的调度 */

        // 阻塞状态 BLOCKED：当线程试图获取一个对象锁，而对象锁被其他线程所持有，则进入BLOCKED状态，当持有锁则进入可执行状态

        /* 无限等待状态 WAITING：一个正在等待线程的状态，也称为等待状态，其原因有两种：1.调用Object.wait()方法；
           2.调用Object.join()方法。处于等待状态的线程，正在等待其他线程去执行一个特定的操作，如：因为wait()而等待的线程，
           在等待另一个线程调用notify()或者notifyAll()方法；因为join()而等待的线程在等待另一个线程结束 */

        /* 计时等待状态 TIMED_WAITING：一个在限定时间内等待的线程的状态，也称为计时等待状态，造成计时等待的原因有三种：
           1.Thread.sleep(long time)   2.Object.wait(long time)   3.Object.join(long time) */

        // 终止状态 TERMINATED：一个完全运行完成的线程的状态，也称为终止状态、结束状态

    }
}

class Show {
    public enum State {
        /* 新建 */
        NEW ,

        /* 可运行状态 */
        RUNNABLE ,

        /* 阻塞状态 */
        BLOCKED ,

        /* 无限等待状态 */
        WAITING ,

        /* 计时等待状态 */
        TIMED_WAITING ,

        /* 终止 */
        TERMINATED ;
    }
}
