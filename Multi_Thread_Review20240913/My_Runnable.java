package Multi_Thread_Review20240913;

/* 实现多线程的第二种方式：实现Runnable接口 */
/* 重写Runnable中的run方法，然后将My_Runnable的实例对象作为Thread构造函数的参数，创建Thread对象 */

public class My_Runnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("这是" + Thread.currentThread().getName() + (i + 1) + "条线程");

        }
    }
}
