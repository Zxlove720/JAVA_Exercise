package Exercise20240723;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.Date;
public class Exercise4 {
    public static void main(String[] args) throws ParseException {
//        需求：
//        请使用代码实现计算你活了多少天，用JDK7和JDK8两种方式完成
        Scanner sc = new Scanner(System.in);
        // JDK7;
        System.out.println("请输入你的生日");
        String birthday = sc.nextLine();
        SimpleDateFormat birthdayFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = birthdayFormat.parse(birthday);
        Long birthdayTime = birthdayDate.getTime();
        System.out.println("已经活了" + ((System.currentTimeMillis() - birthdayTime) / 1000 / 3600 / 24) + "天");

        // JDK8
        LocalDate birthday8 = LocalDate.of(2004, 10, 14);
        LocalDate nowTime = LocalDate.now();
        long days = ChronoUnit.DAYS.between(birthday8, nowTime);
        System.out.println(days);

    }
}
