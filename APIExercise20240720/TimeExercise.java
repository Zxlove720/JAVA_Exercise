package APIExercise20240720;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
public class TimeExercise {
    public static void main(String[] args) throws ParseException {
        /*
     假设，你初恋的出生年月日为:2000-11-11
     请用字符串表示这个数据，并将其转换为:2000年11月11日

     创建一个Date对象表示2000年11月11日
     创建一个SimpleDateFormat对象，并定义格式为年月日把时间变成:2000年11月11日
        */
        String bornTime = "2000-11-11";
        SimpleDateFormat formatBirthday = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = formatBirthday.parse(bornTime);
        System.out.println(birthday);
        SimpleDateFormat newFormat = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(newFormat.format(birthday));

    }
}
