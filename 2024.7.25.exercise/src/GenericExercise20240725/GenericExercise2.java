package GenericExercise20240725;
import java.util.Scanner;
public class GenericExercise2 {
    public static void main(String[] args) {
        // Java中可以用泛型方法来简化代码，因为泛型方法的参数可以接收多种数据类型，所以说很多类似的方法
        // 可以通过泛型方法来实现，从而简化代码
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.14, 4.5, 5.4};
        String[] stringArray = {"abc", "acb", "cba", "cba", "bac"};
        // 有三个不同类型的数组，可以用一个泛型方法将其遍历打印
        printArray(integerArray); // 泛型方法的参数可以传递一切引用数据类型
        printArray(doubleArray);
        printArray(stringArray);
    }

    public static <E>void printArray(E[] array) {
        for (E e : array) {
            System.out.printf("%s ", e);
        }
        System.out.println();
    }

    // 泛型方法可以传递一切引用数据类型的原理：类型擦除
    /*在Java中，泛型是在编译时处理的，编译器会在编译过程中移除所有的泛型类型信息，这个过程称为类型擦除。
    类型擦除的结果是，所有的泛型类型参数都会被替换为它们的上界（如果没有指定上界，则替换为Object）所以
    不管传递的是什么对象类型，编译之后都是一样的类型*/
}
