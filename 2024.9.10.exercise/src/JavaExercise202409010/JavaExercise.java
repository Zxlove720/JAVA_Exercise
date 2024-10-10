package JavaExercise202409010;

import java.util.TreeMap;

public class JavaExercise {
    public static void main(String[] args) {
        // 创建一个TreeMap实例
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // 向TreeMap中添加键值对
        treeMap.put("Apple", 50);
        treeMap.put("Banana", 30);
        treeMap.put("Mango", 20);

        // 获取并打印某个键对应的值
        System.out.println("Banana的价格: " + treeMap.get("Banana"));

        // 移除一个键值对
        treeMap.remove("Mango");

        // 打印整个TreeMap
        System.out.println("TreeMap内容: " + treeMap);

        // 获取并打印TreeMap的大小
        System.out.println("TreeMap大小: " + treeMap.size());

        // 获取并打印TreeMap中的第一个和最后一个键
        System.out.println("第一个键: " + treeMap.firstKey());
        System.out.println("最后一个键: " + treeMap.lastKey());
    }
}
