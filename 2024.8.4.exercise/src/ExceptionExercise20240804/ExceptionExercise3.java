package ExceptionExercise20240804;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionExercise3 {                            // 还可以通过","在同一个方法中Throws多个异常
    public static void main(String[] args) throws ParseException, IOException { // 主方法中需要Throws一个ParseException异常
        // 声明异常：Throws
        // 方法名(参数) Throws 异常类名1, 异常类名2
        /* Throws声明异常的作用：当代码内部可能发生异常时，将可能出现的问题声明出来，相当于提醒调用者（给调用者反馈）
        或者当我们不希望在当前方法中捕获异常，并且希望将异常传递给上层调用者来处理时，可以使用throws关键字（不用自己捕获了）*/


        // 创建时间的格式
        SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 创建时间
        String time = "1998-08-29";
        Date birthDay = timeFormat.parse(time); // 此处就需要声明异常
        System.out.println(birthDay);
    }
}
