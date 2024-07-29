package StreamExercise20240729;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StreamExercise1 {
    public static void main(String[] args) {
        // Stream流可以理解为流水线，用来处理集合、数组中的每一个元素
        // Stream流中可以对元素进行很多操作，但是只能有一个终结方法，一旦终结方法使用，Stream关闭

        // 案例需求
        /* 创建一个集合，存储多个字符串元素把集合中所有以"张"开头的元素存储到一个新的集合
        把"张"开头的集合中的长度为3的元素存储到一个新的集合，遍历上一步得到的集合 */
        ArrayList<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
        ArrayList<String> newList = new ArrayList<>();
//        list.stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.startsWith("张");
//            }
//        }).filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return s.length() == 3;
//            }
//        }).forEach(s -> newList.add(s));
//        System.out.println(newList);

        /* Stream中的filter的方法可以用来过滤不满足条件的元素，当返回false时，则表明元素不满足条件，那么就过滤了，后面的
        Stream流中就不会有被过滤的元素 */

        /* Stream的返回值只能使用一次，所以说不建议创建对象来接收其返回值，建议链式编程 */

        // 替换为Lambda形式
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> newList.add(s));
        System.out.println(newList);

        /* 用Stream的好处：1.可以直接阅读代码的核心部分，而跳过了很多与逻辑无关的语句
                          2.Stream将函数式编程的思想在Java中发扬
                          3.代码简洁

           Stream的弊端：代码阅读性变差
         */

    }
}
