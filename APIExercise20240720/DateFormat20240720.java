package APIExercise20240720;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// SimpleDateFormat导包
public class DateFormat20240720 {
    public static void main(String[] args) throws ParseException {
        /* DateFormat是一个抽象类，不能直接创建对象，要用其子类simpleDateFormat */
        SimpleDateFormat normalFormat = new SimpleDateFormat();
        // 无参构造，使用默认的格式
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒"); // HH是24小时制，hh是12小时制
        // 有参构造，使用传递的格式

        // public String format(Date date)：将Date对象格式化为字符串
        String nowTime = normalFormat.format(new Date()); // 用默认的格式得到时间的字符串
        System.out.println(nowTime);
        String formatNowTime = format.format(new Date()); // 用自己的格式得到时间的字符串
        System.out.println(formatNowTime);

        // public Date parse(String source)：将字符串解析为Date对象，格式需要严格对应
        String timeNow = "2024年07月20日 21时30分26秒";
        Date dateTime = format.parse(timeNow); // 使用此方法要处理异常
        System.out.println(dateTime); // 成功解析

    }
}
