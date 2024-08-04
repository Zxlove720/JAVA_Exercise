package ExceptionExercise20240804;

public class ExceptionExercise4 {
    public static void main(String[] args) {
        // 捕获异常
        // try-catch的方式可以捕获异常
        // 捕获异常是针对Java中的特定的异常语句进行捕获，可以对出现的被捕获的异常进行指定方式的处理

        int[] array = {1,2,3,4,5};
        try{
            int number = Tools.getElement(array, 10);
            System.out.println(1 / 0);
            System.out.println(number);
        }catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("索引越界，得到最大索引元素: " + Tools.getElement(array, array.length - 1));
            } else if (e instanceof ArithmeticException) {
                System.out.println("除法运算异常");
            }
        }
        /* 相当于是getElement方法new了一个ArrayIndexOutOfBoundsException异常对象返回给主方法，然后catch就可以捕获
        到这个异常，从而进入catch的内部 */


        // 捕获异常的细节：
        // 1.try和catch必须合在一起使用，二者都不可以分开使用
        // 2.假如多个异常同时发生，只会捕获到第一个出现的异常（因为当捕获到异常之后就会直接进入catch了）
    }
}
