package TreeMapExercise20240728;

import java.util.Map;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class TreeMapExercise1 {
    public static void main(String[] args) {
        // TreeMap是Map接口的实现类，其底层是红黑树的结构，是可以进行排序的集合
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 5);
        treeMap.put("Water", 2);
        treeMap.put("Pear", 5);
        treeMap.put("chip", 7);
        treeMap.put("cake", 15);
        System.out.println(treeMap);
        treeMap.forEach((s, integer) -> System.out.println(s + " : " + integer));
    }
}
