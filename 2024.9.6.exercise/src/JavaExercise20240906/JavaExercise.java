package JavaExercise20240906;

import java.util.HashMap;
import java.util.Map;

public class JavaExercise {
    public static void main(String[] args) {
        // 创建一个HashMap对象
        Map<String, Integer> map = new HashMap<>();

        // 向Map中添加键值对
        map.put("苹果", 3);
        map.put("香蕉", 5);
        map.put("橙子", 2);

        // 遍历Map中的键值对
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " 有 " + entry.getValue() + " 个");
        }

        // 获取特定键的值
        int appleCount = map.get("苹果");
        System.out.println("苹果的数量是: " + appleCount);

        // 检查Map中是否包含特定的键
        if (map.containsKey("香蕉")) {
            System.out.println("Map中包含香蕉");
        }

        // 删除特定的键值对
        map.remove("橙子");
        System.out.println("删除橙子后的Map: " + map);
    }
}
