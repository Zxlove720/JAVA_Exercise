package SimpleDateFormat20240717;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class SimpleDateFormatExercise {
    public static void main(String[] args) throws ParseException {
        Date now = new Date(); // 获得现在的时间
        SimpleDateFormat format1 = new SimpleDateFormat(); // 用空参构造SimpleDateFormat，相当于就是默认格式
        String timeNow1 = format1.format(now);
        System.out.println(timeNow1); // 2024/7/17 13:59
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        // 有参构造SimpleDateFormat，用传递的格式（字符串形式）
        String timeNow2 = format2.format(now);
        System.out.println(timeNow2); // 2024年07月17日 13时59分53秒

        String time = "2024年07月17日 14时04分50秒";
        SimpleDateFormat formatToString = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date day = formatToString.parse(time); /* 通过一个时间的字符串，可以转换为一个date对象，字符串
        和simpleDateFormat的格式必须完全一致，不然报错 */
        System.out.println(day);

    }
}
