package IOExceptionExercise20240806;

import java.io.FileWriter;
import java.io.IOException;

public class IOExceptionExercise1 {
    // 面对IO的异常，不建议使用异常抛出，建议使用try-catch-finally代码处理异常
    // JDK7之前
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("fw.txt");
            fw.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // finally中必须对创建的流进行资源释放，无论是否产生异常
            try {
                if (fw != null) {
                    fw.close(); // 如果fw不是null，直接关闭
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // JDK7的处理，因为finally中对于资源释放代码太冗杂，所以说简化了写法
        // 创建流对象
        try (FileWriter fw2 = new FileWriter("fw.txt"); ) {
            // 写出数据
            fw2.write("hello world");
        } catch (IOException e) {
            e.printStackTrace();
        } // 无需finally释放资源，自动释放
        // 这是try-with-resource语句，在resource中就可以将资源释放
    }
}
