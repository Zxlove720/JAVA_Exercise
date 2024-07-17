package InstantExercise20240717;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class InstantExercise {
    public static void main(String[] args) {
        /*Instant instant = new Instant();*/ // 无参构造private，无法创造实例对象
        Instant nowTime = Instant.now(); // 获得现在的标准时间对象（是零时区的）
        System.out.println(nowTime);
        Instant time = Instant.ofEpochSecond(60); // 返回从时间零点经过多少秒之后的时间
        System.out.println(time);
        Instant time2 = Instant.ofEpochMilli(1000);
        Instant time3 = Instant.ofEpochMilli(2000);

        // Instant中的isAfter和isBefore方法可以用来比较调用者的时间是否在参数时间的之前（后）
        System.out.println(time3.isAfter(time2)); // 比较time3的时间是否在time2之后true
        System.out.println(time2.isAfter(time3)); // 比较time2的时间是否在time3之后false
        System.out.println(time2.isBefore(time3)); // 比较time2的时间是否在time3之前true
        System.out.println(time3.isBefore(time2)); // 比较time3的时间是否在time2之前false

        // minus......可以用来减少调用者对应参数单位的时间如minusMillis minusSecond等
        /* 但千万注意，JDK8之后time一但创建绝对不能更改，无论怎么用方法改变其时间，其本来的时间没有变
           只是创建了一个新的时间 */
        Instant time4 = time2.minusMillis(5000); // time2本身是没变的，变化之后其实是产生了一个新的时间戳
        System.out.println(time2.minusMillis(2000)); // 返回time2减少2000ms的时间
        System.out.println(time2);
        System.out.println(time3.minusMillis(5000)); // 返回time3减少5000ms的时间
        System.out.println(time3);
        System.out.println(time3.minusSeconds(5000)); // 返回time3减少5000m的时间

        // plus......顾名思义可以用来增加调用者对应参数单位的时间如plusMillis plusSecond等
        /* 和minus方法一样，time一但创建绝对不能更改，无论怎么用方法改变其时间，其本来的时间没有变
           只是创建了一个新的时间 */
        System.out.println("----------------------------------------------");
        Instant time5 = time2.plusMillis(10000000); // 虽然是在time2上面改的，但是time2真没变
        System.out.println(time2);
        System.out.println(time5); // 其实产生的变化是在新的时间戳time5上面

        System.out.println("----------------------------------------------");
        // Instant 还可以用来指定时区
        ZonedDateTime time6 = Instant.now().atZone(ZoneId.of("Asia/Chongqing"));
        System.out.println(time6);

    }
}
