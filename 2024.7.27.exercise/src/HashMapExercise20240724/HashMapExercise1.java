package HashMapExercise20240724;
import java.util.HashMap;
import java.util.Map;
public class HashMapExercise1 {
    public static void main(String[] args) {
        // 双列集合：分为键(key)值(value)，一个键必须只对应一个值，键在Map中不能重复，值可以在Map中重复
        // Map 是双列集合的顶级接口，HashMap和TreeMap都是其实现类

        Map<String, String> map = new HashMap<>();

        // put方法：Map中的put方法，可以添加一个键值对到Map集合中
        map.put("Apple", "5");
        map.put("Water", "2");
        map.put("Pear", "5");
        map.put("Chip", "7");
        map.put("Cake", "15");
        System.out.println(map.put("Apple", "15000"));
        // 假如在Map集合中添加重复的键（值不同），那么会进行覆盖，将原来键的值覆盖成新值，并且返回被覆盖的值
        System.out.println(map);
        System.out.println("-------------------------------------");

        // remove方法，根据指定的键删除Map中的元素（不能根据值删除，因为值可能有重复的）
        System.out.println(map.remove("Apple")); // 如果成功删除，返回被删除的键的值
        System.out.println(map.remove("Iphone")); // 如果删除失败，返回null
        System.out.println("-------------------------------------");

        // clear方法，清空Map集合
        System.out.println(map);
        //map.clear();
        System.out.println(map); // Map直接清空

        // containsKey/containsValue 判断Map中是否含有指定的key或者value
        System.out.println(map.containsValue("7"));
        System.out.println(map.containsKey("Water"));
        System.out.println("-------------------------------------");


        // isEmpty 判断集合是否为空
        System.out.println(map.isEmpty()); // 目前非空
        System.out.println(map.size()); // 返回集合的长度（现在集合中有的元素）
        map.clear(); // 清空集合中所有的元素
        System.out.println(map.isEmpty()); // 目前集合为空
        System.out.println(map.size()); // 打印size为0

    }
}
