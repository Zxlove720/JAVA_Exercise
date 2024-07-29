package StreamExercise20240729;

import java.util.*;
import java.util.stream.Stream;

public class StreamExercise2 {
    public static void main(String[] args) {
        // Stream中的主要方法
        // 1.获取Stream流：创建一条Stream流水线，并将数据元素放进流水线准备进一步操作
        // 2.中间方法：流水线上面的操作（如filter），操作中间方法之后，可以继续进行其他操作
        // 3.终结方法：一个Stream流中只能有一个终结方法，终结方法是Stream流中的最后一个操作，一旦使用，不能再操作Stream流

        // 生成Stream流的方式
        // 1.Collection体系的集合：可以使用默认的方法生成Stream流
        // List系列
        List<String> list = new ArrayList<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
        Stream<String> stream = list.stream(); // list系列的集合可以通过stream方法得到Stream对象
        Stream<String> stream1 = stream.filter(s -> s.startsWith("张")); // 不建议使用对象接收Stream方法的返回值
        // Set系列
        Set<String> set = new HashSet<>(List.of("张三丰","张无忌","张翠山","王二麻子","张良","谢广坤"));
        set.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));

        // 2.Map体系的集合无法直接生成Stream流，需要转成Set集合，然后间接的生成流
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        map.put("e", "5");
        map.put("f", "6");
        /* map.stream() 可见Map中是没有Stream()这个方法的，所以说不能直接转 */
        // 先将Map转换为Set集合，然后再用Set集合得到Stream集合，再进行操作
        Set<String> keySet = map.keySet();
        keySet.stream().filter(s -> s.startsWith("a")).forEach(s -> System.out.println(s + " : " + map.get(s)));

        // 3.同种数据类型的多个数据（非集合和数组中）：通过Stream接口的静态方法of(T... values)生成Stream流
        Stream<String> stringStream = Stream.of("a", "b", "c");
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        stringStream.filter(s -> s.startsWith("a")).forEach(s -> System.out.printf(s));
        System.out.println();
        integerStream.filter(s -> s == 3).forEach(s -> System.out.println(s));
    }
}
