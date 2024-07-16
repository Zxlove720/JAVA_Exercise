package RuntimeExercise20240716;
import java.io.IOException;
import java.util.Scanner;
public class RuntimeExercise {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        /* Runtime表示Java中运行时对象，可以获取到程序运行时设计到的一些信息,
        由于一个系统只能有一个运行环境对象，所以说Runtime不能随意的new，而是
        提供了getRuntime方法得到当前系统的运行环境对象，从而用对象调用其中的
        非静态方法
         */
        /*Runtime r = new Runtime() 构造方法被private修饰*/
        Runtime r = Runtime.getRuntime(); // 返回的类型是Runtime
        int processors = r.availableProcessors(); // 返回int类型，本机CPU的线程数
        System.out.println("本机的CPU线程数是:" + processors);
        long memory = r.maxMemory(); // Long 返回JVM最多可以从本机获得的内存（byte）
        long nowMemory = r.totalMemory(); // Long 返回JVM已经从本机获得的内存（byte）
        long fMemory = r.freeMemory(); // Long 返回JVM还剩多少内存（byte）
        System.out.println("JVM最多可以从本机调用" + (memory / (1024 * 1024)) + "MB内存");
        System.out.println("JVM已经从本机调用" + (nowMemory / (1024 * 1024)) + "MB内存");
        System.out.println("JVM还剩" + (fMemory / (1024 * 1024)) + "MB内存");
        // 可以用来动态监视内存

        // exec执行cmd命令
        // 要抛出一个IO异常：throws IOException
        r.exec("shutdown -s -t 60");
        int s = sc.nextInt();
        r.exec("shutdown -a");
    }
}
