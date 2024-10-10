package APIExercise20240720;
import java.time.Duration;
import java.time.LocalDateTime;

public class Duration20240720 {
    public static void main(String[] args) {
        LocalDateTime nowTime = LocalDateTime.now(); // 得到现在的时间
        LocalDateTime startTime = LocalDateTime.of(1970, 1 , 1, 0, 0, 0);
        // 得到当时的时间（时间零点），通过有参构造，传递年月日时分秒
        Duration longTime = Duration.between(startTime, nowTime); // 得到时间差，注意，参数是第二个减第一个（后减前）
        System.out.println(longTime);
        System.out.println(longTime.toDays()); // 定义时间差是longTime，那么可以调用toDays得到相差的天数
        System.out.println(longTime.toHours()); // 定义时间差是longTime，那么可以调用toHours得到相差的小时数
        System.out.println(longTime.toMinutes()); // 定义时间差是longTime，那么可以调用toMinutes得到相差的分钟数
    }
}
