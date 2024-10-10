package StreamExercise20240729;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamExercise5 {
    public static void main(String[] args) {
        // Stream收集操作
        // 当数据被Stream流的方法操作完毕之后，可以将其收集到集合中

        // collect(stream中的方法) 将结果收集到集合中
        List<String> list = new ArrayList<>(List.of("张三丰","张无忌","王翠山","王二麻子","张良","谢广坤"));
        // 工具类Collectors提供了具体的收集方式
        // toList
        List<String> returnList = list.stream().filter(s -> s.startsWith("张")).toList();
        // 此处可以将collect(Collectors.toList())简化为toList
        System.out.println(returnList);
        // toSet
        Set<String> set = list.stream().filter(s -> s.length() == 3).collect(Collectors.toSet());
        // 此处不存在简化的方法
        System.out.println(set);
    }
}
