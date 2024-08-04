package ExceptionExercise20240804;

public class ExceptionExercise1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int number = Tools.getElement(array, 10);
        /* getElement方法是根据索引返回元素的方法，当索引越界时，发生运行时异常，JVM认识这个Exception
        ArrayIndexOutOfBoundsException，会new一个ArrayIndexOutOfBoundsException，然后抛给main方法
        当main方法得到ArrayIndexOutOfBoundsException异常后没有处理，异常抛给JVM，然后JVM虚拟机停止运行 */
        System.out.println(number);
        System.out.println("over");
    }
}
