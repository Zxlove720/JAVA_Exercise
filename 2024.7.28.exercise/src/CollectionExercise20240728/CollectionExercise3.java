package CollectionExercise20240728;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionExercise3 {
    public static void main(String[] args) {
        // 不可变的Map集合
        // Map中键是不可以重复的
        // Map中的of方法参数是有上限的，最多20个参数（也就是10个键值对）

        // 键值对个数≤10
        Student s1 = new Student("张三", 18);
        Student s2 = new Student("李四", 21);
        Student s3 = new Student("王五", 19);
        Student s4 = new Student("赵六", 23);
        Student s5 = new Student("钱七", 17);
        Student s6 = new Student("周八", 30);
        Map<Student, String> studentMap = Map.of(s1, "重庆", s2, "四川", s3, "武汉",
                                                 s4, "北京", s5, "上海", s6, "深圳");
        studentMap.forEach((key, value) -> System.out.println(key.getName() + " " + key.getAge() + " = " + value));
        // 不可变的Map无法更改
        studentMap.put(new Student("小明", 20), "USA"); // 无法更改

        // 键值对个数＞10：此时of中的参数已经不够了，需要用Map中的ofEntries方法
        // 创建11个键值对对象
        HashMap<String, String> hm = new HashMap<>();
        hm.put("张三", "南京");
        hm.put("李四", "北京");
        hm.put("王五", "上海");
        hm.put("赵六", "北京");
        hm.put("孙七", "深圳");
        hm.put("周八", "杭州");
        hm.put("吴九", "宁波");
        hm.put("郑十", "苏州");
        hm.put("刘一", "无锡");
        hm.put("陈二", "嘉兴");
        hm.put("aaa", "111");

        // 先将HashMap中的元素转换为entries集合
        Set<Map.Entry<String, String>> entrySet = hm.entrySet();
        // 创建entries数组
        Map.Entry<String, String>[] arr = new Map.Entry[0];
        // 将entries集合转换为数组，用新的数组接受
        Map.Entry<String, String>[] arr1 = entrySet.toArray(arr);
        // 将entries的数组传递给ofEntries方法
        Map<String, String> map = Map.ofEntries(arr1);
        // 不可变的Map创造成功，无法改变
        map.put("bbb","222");

        // 可以调用Map中的copyOf方法得到一个不可变的Map对象，其底层原理和上面的代码一样
        Map<String, String> map2 = Map.copyOf(hm);
        map.put("bbb","222");


    }
}

class Student{
    String name;
    int age;

    public Student() {
        this("TestStudent", 20);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}