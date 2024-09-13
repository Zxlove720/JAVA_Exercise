package Multi_Thread_Review20240913;
import java.util.concurrent.Callable;

/* 实现多线程的第三种方法：实现Callable接口 */
/* 重写Callable中的call方法，Callable需要返回值 */
/* 用My_Callable作为FutureTask类构造函数的参数，然后再用FutureTask对象作为Thread构造函数的参数 */

public class My_Callable implements Callable {

    @Override
    public String call() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("这是" + Thread.currentThread().getName() + "的第" + (i + 1) + "次执行");
        }
        return "完成";
    }
}
