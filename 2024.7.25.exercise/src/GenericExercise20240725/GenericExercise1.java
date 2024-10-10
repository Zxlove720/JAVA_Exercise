package GenericExercise20240725;

import java.util.ArrayList;
import java.util.List;

public class GenericExercise1 {
    public static void main(String[] args) {
        // 泛型是JDK5以后引入的新的特性，主要目的是为了提供编译时的类型安全检测机制
        // 使用泛型的好处-> 1.将运行时出现的问题提前到编译期间
        //                 2.避免了强制类型转换

        // 假如说没有泛型
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);
        list.add(3.14);
        System.out.println(list); // 假如说没有泛型，所有类型的数据都可以存放到集合中，但是取出元素十分麻烦
        String element = (String)list.get(1); // 想要用get方法得到元素的话，必须强制类型转换，因为默认是Object类型的
        String element1 = (String)list.get(0); // 假如0索引正好是String类型的，那么此操作正确
        String element2 = (String)list.get(1); // 但1索引不是String类型的，编译也不会报错，只有运行之后才会报错
        // 就算不会出现类型错误的情况，但是也可以避免类型转换，节约时间


    }
}
