package SetExercise20240725;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExercise {
    public static void main(String[] args) {
        // TreeSet是Set的实现类，其特点是：
        // 1.不可以存储重复的元素   2.内部没有索引   3.可以将元素排序

        // TreeSet() 构造方法就是根据元素的自然排序进行排序
        // TreeSet(Comparator comparator) 根据指定的比较器进行排序

        // TreeSet()
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(2);
        // 可见其加入元素的顺序是无序的
        System.out.println(treeSet); // 输出1, 2, 3, 4, 5 但是打印集合，其中的元素是有序的
        /* 加入顺序是无序的，但是在集合中的顺序是有序的，证明了TreeSet内部是具备排序的功能的，能够
        根据自然排序规则，或者指定的比较器进行排序 */

        // 其底层的实现逻辑是红黑树（难以分析），所以说可以进行排序，但是自然排序规则有一定的局限性，
        // 所以说有时需要指定比较器进行排序

    }
}
