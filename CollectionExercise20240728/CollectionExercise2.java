package CollectionExercise20240728;

import java.util.*;

public class CollectionExercise2 {
    public static void main(String[] args) {
        // 不可变的Set集合
        // 和不可变的List类似，不能修改，并且不可变Set中，参数必须确保唯一性（不可变Set中不能存重复元素）

        // 创建不可变Set集合对象
        Set<String> nameSet = Set.of("张三", "李四", "王五", "赵六", "钱七", "周八");
        // 遍历
        nameSet.forEach(System.out::println);

        // 尝试修改
        // nameSet.add("小明"); // 编译阶段直接报警告，运行直接报错：UnsupportedOperationException
        // nameSet.remove(2); // Set中的remove不能根据索引删，因为Set中没有索引机制
        // nameSet.remove("张三");

        //Set<String> nameSetTest = Set.of("张三", "李四", "王五", "赵六", "钱七", "周八", "张三");
        // 尝试在不可变Set中加入重复元素“张三”，编译阶段报警告：重复的Set元素，运行报错：IllegalArgumentException

//        Set<String> set = new TreeSet<>();
//        set.add("aa");
//        set.add("bb");
//        set.add("cc");
//        set.add("aa");
//        System.out.println(set);
//
//        Set<String> hash = new HashSet<>();
//        hash.add("aa");
//        hash.add("bb");
//        hash.add("cc");
//        hash.add("aa");
//        System.out.println(hash);

        Map<People, String> hashMap = new TreeMap<>();
        hashMap.put(new People("aa"), "1");
        hashMap.put(new People("aa"), "2");
        hashMap.put(new People("aa"), "3");
        hashMap.put(new People("aa"), "4");
        hashMap.put(new People("aa"), "2");

        hashMap.forEach((key, value) -> System.out.println(key.getName() + " : " + value));




    }
}

class People implements Comparable<People>{
    private String name;

    public People(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public int compareTo(People o) {
        return this.getName().compareTo(o.getName());
    }
}