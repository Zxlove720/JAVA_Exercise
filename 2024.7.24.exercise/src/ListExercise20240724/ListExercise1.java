package ListExercise20240724;

import java.util.ArrayList;
import java.util.Collection;

public class ListExercise1 {
    public static void main(String[] args) {
        // 集合和数组的异同
        // 相同点:二者都是数据的容器，都可以用来存储多个数据
        // 不同点:1.数组一旦创建，长度是不可以改变的，而集合可以随意改变长度
        //        2.数组可以存储基本数据类型，也可以存储引用数据类型，而集合只能存储引用数据类型

        // 集合分为单列集合和双列集合，单列集合只有一个数据，而双列集合是键值对
        // Collection是单列集合的顶级父类，Map是双列集合的顶级父类
        // 单列集合分为可以重复的List和不可重复的Set，Collection是一个接口，可以使用
        // 其实现类或者多态的方式得到Collection的对象

        // 1.多态 Collection<String> list = new ArrayList<>();
        // 2.实现类，细节：ArrayList是实现List接口，而List接口继承Collection
        // ArrayList<String> arrayList = new ArrayList<>();

        Collection<String> arrayList = new ArrayList<>();
        // boolean add(E e) 因为单列集合中无论如何都可以添加成功元素，所以说返回值一般忽略
        System.out.println(arrayList.add("abc")); // 添加元素的类型和泛型一致，成功添加
        System.out.println(arrayList);
        //System.out.println(arrayList.add(123)); // 假如限定了泛型，add不正确的元素类型，编译阶段直接报错
        System.out.println("---------------------------------------------");

        // boolean remove(Object o) 删除指定的元素
        System.out.println(arrayList);
        System.out.println(arrayList.remove("abc")); // 元素存在集合中，成功删除
        System.out.println(arrayList.remove("bcd")); // 元素不存在集合中，删除失败
        System.out.println(arrayList);
        System.out.println("---------------------------------------------");

        // boolean removeIf(Object o) 根据条件删除
        arrayList.add("abc");
        arrayList.add("bcd");
        arrayList.add("acb");
        arrayList.add("bac");
        arrayList.add("cba");
        System.out.println(arrayList);
        System.out.println(arrayList.removeIf(s -> s.contains("a")));
        // 这是最简化的Lambda表达式，实际上是实现了一个Predicate接口，用于判断元素中是否包含a
        System.out.println(arrayList);
        System.out.println("---------------------------------------------");

        // void clear() 清空集合中的所有元素
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("---------------------------------------------");

        // boolean contains(Object o) 判断集合中是否存在指定的元素
        arrayList.add("abc");
        arrayList.add("acb");
        arrayList.add("bca");
        arrayList.add("bac");
        arrayList.add("cba");
        arrayList.add("cab");
        System.out.println(arrayList);
        System.out.println(arrayList.contains("abc"));
        System.out.println(arrayList.contains("cab"));
        System.out.println(arrayList.contains("bac"));
        System.out.println(arrayList.contains("jkl")); // 不存在jkl
        System.out.println("---------------------------------------------");

        // boolean isEmpty() 判断集合是否为空
        System.out.println(arrayList.isEmpty()); // 现在是非空的
        System.out.println("---------------------------------------------");

        // int size() 返回集合的长度（元素个数）
        System.out.println(arrayList.size());
        arrayList.clear(); // 清除所有元素
        System.out.println(arrayList.isEmpty()); // 这下空了

    }
}
