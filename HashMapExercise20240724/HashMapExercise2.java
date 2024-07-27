package HashMapExercise20240724;

import java.util.*;
import java.util.regex.Pattern;

public class HashMapExercise2 {
    public static void main(String[] args) {
        // Map中存放的是一个个键值对，所以说取出也是以键值对的形式取出的
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put("Apple", "5");
        hashMap.put("Water", "2");
        hashMap.put("Pear", "5");
        hashMap.put("Chip", "7");
        hashMap.put("Cake", "15");

        // get 根据键获取值(需要传递键)
        String result1 = hashMap.get("Water"); // 传递正确的键，可以返回对应的值
        System.out.println(result1);
        String result2 = hashMap.get("Watermelon"); // 传递错误的键，得到null
        System.out.println(result2); // 注意：这个错误只有在运行的阶段才可以发现

        // KeySet 获取所有键的集合并返回，返回的是一个Set集合，可以理解为将双列集合拆解成单列集合
        Set<String> keySet = hashMap.keySet(); // 此处默认是HashSet
        System.out.println(keySet);

        // values 获取的所有的值的集合，并返回一个Collection集合
        Collection<String> values = hashMap.values();
        System.out.println(values);

        // 获取Map中所有的键值对，并且返回键值对的Set集合
        Set<Map.Entry<String, String>> entrySet = hashMap.entrySet();
        System.out.println(entrySet);

        System.out.println("------------------遍历---------------------");
        // 遍历
        // 根据keySet来遍历得到所有key，然后通过get方法去找对应的value
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = hashMap.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("------------------遍历---------------------");

        // 遍历entrySet键值对集合，再用其中的getKey和getValue方法遍历
        for (Map.Entry<String, String> str : entrySet) {
            String key = str.getKey();
            String value = str.getValue();
            System.out.println(key + " : " + value);
        }



    }
}
