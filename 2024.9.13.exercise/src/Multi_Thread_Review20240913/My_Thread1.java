package Multi_Thread_Review20240913;

/* 实现多线程的第一种方式：继承Thread类 */
/* 继承Thread类，重写其中的run方法，run方法中的代码是线程想要实现的功能 */

public class My_Thread1 extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 100; i++) {
            System.out.println("这是" + getName() + "第" + (i + 1) + "次线程");
        }
    }

}
