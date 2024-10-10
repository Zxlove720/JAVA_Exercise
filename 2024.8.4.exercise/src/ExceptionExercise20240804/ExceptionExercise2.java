package ExceptionExercise20240804;

public class ExceptionExercise2 {
    public static void main(String[] args) {
        // 抛出异常：throw
        // 格式：throw new 异常类(参数)
        /* throw作用：用来手动抛出一个异常对象，结束当前方法的执行。主要是遇见错误之后，抛出异常，从而
        告诉使用者错误的原因 */

        int[] array = {1,2,3,4,5,6};
        int number = getElement(array, 10);
        System.out.println(number);
        System.out.println("over");
    }

    public static int getElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            throw new ArrayIndexOutOfBoundsException("该索引越界"); // 这里的参数可以传递一个字符串，表示异常的原因
        }
        return array[index];
    }
}
