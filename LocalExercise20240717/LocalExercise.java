package LocalExercise20240717;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalExercise {
    public static void main(String[] args) {
        // LocalDate 能够获取日历对象，但是只能精确到年月日
        /* LocalDate nowDate = new LocalDate(); */ // 其构造参数有private权限
        LocalDate nowDate = LocalDate.now(); // 可以通过其静态的now方法得到现在的日期
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        System.out.println(nowDate);
        System.out.println(dtf.format(nowDate)); // 可以通过DateTimeFormatter设置其格式
        // 可以通过get系列方法得到想要的数据
        System.out.println(nowDate.getYear());
        System.out.println(nowDate.getMonth()); // 得到是几月
        System.out.println(nowDate.getMonthValue()); // 可以单纯得到月份的值

        System.out.println("-------------------------------------");
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime); // 相比于LocalDate可以精确到秒，其他方法和LocalDate是一样的
        System.out.println(nowTime.getSecond()); // 得到秒
        System.out.println(nowTime.getHour()); // 得到时
        System.out.println(nowTime.withHour(5)); // 修改时

        System.out.println("-------------------------------------");
        // LocalDateTime可以得到日期和时间
        LocalDateTime allTime = LocalDateTime.now();
        System.out.println(allTime);
        // get方法同理可以得到其中的数据
        System.out.println(allTime.getYear());

        // 基本上这些方法，这三个类都是通用的，只是这三个类各自的“精度”有所差异




    }
}
