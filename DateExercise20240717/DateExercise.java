package DateExercise20240717;
import java.util.Date;

public class DateExercise {
    public static void main(String[] args) {
        // Date是一个和时间有关的类（单位：ms）
        Date time = new Date(); // 无参构造，返回系统的时间，精确到s,Wed Jul 17 13:15:14 GMT+08:00 2024
        System.out.println(time);
        Date zeroTime = new Date(0L); // 有参构造，传递一个long类型时间（ms），返回距离计算机时间零点的时间（ms）
        System.out.println(zeroTime);// Thu Jan 01 08:00:00 GMT+08:00 1970
        Date time1 = new Date(1000000000000L); // Sun Sep 09 09:46:40 GMT+08:00 2001
        System.out.println(time1); // Sun Sep 09 09:46:40 GMT+08:00 2001
        System.out.println(time1.getTime()); // getTime返回从时间零点到time1的时间（ms）
        System.out.println(time1);
        long now = System.currentTimeMillis();
        time1.setTime(now); // 从时间零点开始设置时间，时间零点加参数（ms）
        System.out.println(time1);

    }
}
