package StreamExercise20240729;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamExercise6 {
    public static void main(String[] args) {
        // toMap
        List<String> list = new ArrayList<>();
        list.add("张三,23");
        list.add("李四,24");
        list.add("王五,25");
        Map<String, Integer> returnMap = list.stream().filter(s -> { // 此处的lambda是为了过滤24岁以下的元素
            String[] arr = s.split(",");
            int age = Integer.parseInt(arr[1]);
            return age >= 24;
        }).collect(Collectors.toMap(s -> s.split(",")[0], // 第一个lambda是为了得到键
                                    s -> Integer.parseInt(s.split(",")[1]))); // 第二个lambda是得到值
        System.out.println(returnMap);

    }
}
