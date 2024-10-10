package SetExercise20240725;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {
        // Set和List的区别：
        // 1.Set中不能存储重复的元素 2.Set中元素没有索引，所以说不能使用普通for遍历
        Set<String> set = new TreeSet<>();
        // add方法，假如加入重复的元素，那么就会假如失败
        System.out.println(set.add("abc")); // 成功加入元素
        System.out.println(set);
        System.out.println(set.add("abc")); // 加入重复的元素则加入失败，返回false
        System.out.println(set); // 集合中也确实没有重复的这个元素
        set.add("bac");
        set.add("cba");
        set.add("acb");
        System.out.println("------------------------------");

        // 遍历Set
        // 1.迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String str = it.next();
            System.out.println(str);
        }
        System.out.println("------------------------------");

        // 2.增强for
        for (String str : set) {
            System.out.println(str);
        }
        System.out.println("------------------------------");

        // 3.Lambda表达式
        set.forEach(System.out::println);

    }
}
