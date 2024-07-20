package APIExercise20240720;
import java.util.Date;
// 导包，Date是util下的
public class Date20240720 {
    public static void main(String[] args) {
        Date nowTime = new Date(); // 得到当前系统时间
        System.out.println(nowTime);
        Date startTime = new Date(0); //得到计算机时间零点
        System.out.println(startTime);
        System.out.println(System.currentTimeMillis()); // 通过System的方法得到现在距离时间零点的ms
        System.out.println(new Date(System.currentTimeMillis()));
        /* Date的无参构造其实是用的currentTimeMillis得到现在距离时间零点的ms，然后再用this调用有参构造
        从而无参构造就是得到当前系统的时间 */
        System.out.println(nowTime.getTime()); // 一个方法得到Date时间距离时间零点的ms
        System.out.println(nowTime);
        nowTime.setTime(1721483401747L); // 根据传递的ms值，得到时间零点加上ms值的时间
        System.out.println(nowTime);
    }
}
