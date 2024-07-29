package StreamExercise20240729;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExercise3 {
    public static void main(String[] args) {
        // Stream流中的中间方法
        List<String> list =new ArrayList<>(List.of("张三丰","张无忌","王翠山","王二麻子","张良","谢广坤"));
        List<String> list2 =new ArrayList<>(List.of("张三","李四","王五","赵六","钱七","周八","张三"));

        // filter过滤：可以对流中的数据进行过滤，符合条件的（true）保留，false则过滤
        list.stream().filter(s -> s.startsWith("王")).filter(s -> s.length() == 4).forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------");

        // limit截取：截取前指定参数个数据，返回流中符合条件元素组成的流
        list.stream().limit(4).forEach(s -> System.out.println(s)); // 用limit截取前流中前4个元素
        System.out.println("--------------------------------------");

        // skip跳过：跳过指定参数个数据，返回由该流跳过后剩余元素组成的流
        list.stream().skip(3).forEach(s -> System.out.println(s)); // 跳过前流中前3个元素
        System.out.println("--------------------------------------");

        // concat合并：将a流和b流合并为同一个流
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = list2.stream();
        Stream<String> stream3 = Stream.concat(stream1, stream2); // 将stream1和stream2中两个流合成了一个流stream3
        stream3.forEach(s -> System.out.println(s));
        System.out.println("--------------------------------------");


        // distinct去重：将stream流中的重复数据去除，保留非重复的数据（依靠equals方法）
        // stream2.distinct().forEach(s -> System.out.println(s));
        // 上面虽然有stream2流，但是stream只能使用一次，上面已经使用过，所以说stream2此处无法继续使用，否则将报错
        list2.stream().distinct().forEach(s -> System.out.println(s)); // 成功去重
    }
}
