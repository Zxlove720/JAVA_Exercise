package CalendarExercise20240717;
import java.util.Calendar;
public class CalendarExercise {
    public static void main(String[] args) {
        // Calendar的构造方法是protected，所以说不能直接new，要用getInstance方法得到其对象
        /*Calendar c = new Calendar(); error */
        Calendar c = Calendar.getInstance(); // 当前的时间
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH) + 1); // 月份必须加1才是真实的月份（从0开始的）
        System.out.println(c.get(Calendar.DAY_OF_WEEK) - 1); // 星期日，1，2，3，4，5，6（真逆天）,建议查表法


    }
}
