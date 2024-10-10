package ExceptionExercise20240805;

public class ExceptionExercise2 {
    private static String[] userName = {"张三","李四","王五","赵六","钱七"};
    public static void main(String[] args) {
        // 自定义异常类
        // 为什么需要自定义异常类？     有些异常是没有被定义好的，所以说在实际的开发中需要根据实际需求自定义异常类

        // 如何自定义异常类？
        // 1.定义编译时期异常类：自定义类，并且必须继承java.lang.Exception
        // 2.定义运行时期异常类：自定义类，必须继承Java.lang.RuntimeException

        try {
            checkUsersName("庄小琳");
        } catch(LoginException e) {
            e.printStackTrace();
        } finally {
            System.out.println("感谢使用");
        }

    }

    public static void checkUsersName(String name) throws LoginException {
        /* 如果一个方法可能会抛出已检查异常（checked exception），则必须在方法的声明中使用
        throws关键字来指明这一点。目的是让调用者知道该方法可能会抛出异常，以便他们在调用时进行适当的异常处理 */

        for (String s : userName) {
            if (s.equals(name)) {
                throw new LoginException(name + "已经存在");
                // 可能会抛出LoginException异常，所以说在方法签名中要throws抛出，或者使用try-catch
            }
        }
    }
}



class LoginException extends Exception{
    // 空参构造
    public LoginException() {}
    // 异常提示的有参构造
    public LoginException(String message) {
        super(message);
    }

}
