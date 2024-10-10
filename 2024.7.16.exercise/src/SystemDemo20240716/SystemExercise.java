package SystemDemo20240716;
import java.util.Scanner;
public class SystemExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System被final修饰，无法继承
        // System的构造方法私有，所以说不能直接new
        // 用其中的方法直接用类名调用即可
        long timeNow = System.currentTimeMillis(); // 返回从1970.1.1零时零分到现在的时间（ms）
        System.out.println(timeNow / 1000 / 3600 / 24 / 365); // 可以通过单位换算得到年份
        // currentTimeMillis可以用来看程序运行的时间


        // System exit(int status)
        // 直接关闭JVM虚拟机，0表示正常退出，非0则是异常退出
        /* System.out.println("程序正在运行");
        System.exit(0);
        System.out.println("程序结束了"); // 这行代码不会执行，JVM已经关闭了 */

        // arraycopy(int[] src, int srcPos, int[] dest, int destPos, int length)
        // 数组拷贝，可以指定数据源数组和目标数组，可以指定起始拷贝索引，和目标复制的索引，和拷贝个数
        System.out.println("请输入数组长度");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("请输入第%d个数字", i + 1);
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 2, 3); // 直接调用即可，无返回值
        for (int i = 0; i < arr2.length; i++) {
            System.out.printf("%d ", arr2[i]);
        }
        // 注意使用arraycopy注意数组越界问题
        // 用arraycopy删除数组中的元素
        System.out.println();
        System.arraycopy(arr, 2, arr, 1, 3); // 1 2 3 4 5
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.printf("%d ", arr[i]);
        }
        System.exit(0); // 其实底层是调用的Runtime中的exit方法
    }
}
