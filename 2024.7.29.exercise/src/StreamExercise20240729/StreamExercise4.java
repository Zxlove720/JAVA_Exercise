package StreamExercise20240729;

import java.util.ArrayList;
import java.util.List;

public class StreamExercise4 {
    public static void main(String[] args) {
        // Stream流的终结方法
        List<String> list = new ArrayList<>(List.of("张三丰","张无忌","王翠山","王二麻子","张良","谢广坤"));
        // 1.forEach遍历：遍历stream流中的元素
        list.stream().filter(s -> s.startsWith("王")).forEach(s -> System.out.println(s));
        System.out.println("---------------------");
        // 2.count计数：统计并返回流中剩余的元素个数
        System.out.println(list.stream().filter(s -> s.length() == 3).count());
    }
}
