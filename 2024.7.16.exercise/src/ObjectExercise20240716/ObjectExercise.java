package ObjectExercise20240716;
import java.util.Scanner;
public class ObjectExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Object obj = new Object();

        Phone phone = new Phone("iqoo", 2299);
        System.out.println(phone.toString()); //返回该对象的字符串表示形式(可以看做是对象的内存地址值)
        // Object 中的 toString是返回的内存地址值的字符串表示形式，大部分情况下无意义，需要在子类中重写
        Phone phone2 = new Phone("iqoo", 2299);
        //System.out.println(phone2.equals(phone)); // Object中的equals方法比较的仍然是两个对象的地址值，需要重写
        // 源码中Object比较用的是“ == ”，比较的是地址值
        System.out.println(phone2.equals(phone));


    }
}
