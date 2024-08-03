package ExceptionExercise20240803;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionExercise2 {
    public static void main(String[] args) throws ParseException { // 在这里抛出的ParseException异常
        // 异常的分类
        // 1.编译时异常（checked异常）
        /* 在编译时期就会检查的异常，如果没有处理异常，在编译阶段就会直接报错 */

        // 2.运行时异常（runtime异常）
        /* 只有当程序运行起来才可以发现的异常，在编译时期无法检查：如数组越界 */

        SimpleDateFormat format = new SimpleDateFormat("yyyy - MM - dd");
        Date now = new Date();
        System.out.println(format.format(now));
        String time = "2024 - 08 - 03";
        Date nowTime = format.parse(time);
        // 这里的parse方法就需要解决编译时异常，可以选择在主方法throws ParseException异常来解决这个编译时异常
    }
}
