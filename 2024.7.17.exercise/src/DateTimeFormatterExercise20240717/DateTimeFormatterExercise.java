package DateTimeFormatterExercise20240717;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.Instant;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExercise {
    public static void main(String[] args) {
        // 得到现在的时间
        ZonedDateTime timeNow = Instant.now().atZone(ZoneId.of("Asia/Chongqing"));
        // 设置DateTimeFormatter中的格式
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH时mm分ss秒");
        // 用刚才设置的格式对得到的时间格式化
        System.out.println(dtf1.format(timeNow));
    }
}
