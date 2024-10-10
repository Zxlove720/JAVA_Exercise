package HashMapExercise20240724;

import java.util.HashMap;

public class HashMapExercise3 {
    public static void main(String[] args) {
        // HashMap是Map接口的实现类对象，底层是哈希表结构的

        /* 通过hashCode方法和equals方法保证键的hash值唯一
        hashCode生成唯一的hash码，每个不同的对象生成不同的hash码（极端情况下还是会重复）
        equals方法保证相同的对象生成的hash码一致*/

        /* 如果是存储自定义对象，那么需要重写hashCode方法和equals方法，其原因
        主要是Object类中的hashCode方法和equals方法主要是根据地址值来生成和判断的
        但大部分情况下，自定义对象需要用成员属性来判断，所以说需要重写*/

        HashMap<String, String> hashMap = new HashMap<>();
        String name = "张三";
        String name2 = "张三";
        System.out.println(name.hashCode());
        System.out.println(name2.hashCode());
        System.out.println("---------hashCode---------");
        /* String中的hashCode方法已经重写了，所以说即使是两个不同的String对象，
        但是其内容(equals比较的已经是内容了，而不是地址)相同，所以说得到的hash值是一样的 */
        Object name3 = "李四";
        Object name4 = "李四";
        System.out.println(name3.hashCode());
        System.out.println(name4.hashCode());
        System.out.println("---------hashCode---------");
        /* 这里虽然是使用的Object中的hashCode方法，但是因为字符串直接赋值存在"串池"的机制
        所以说name3和name4并没有创建两个对象，name3是在堆区创建的新对象但name4实际上是在串池中
        对于name3的引用，所以说hash值相等（二者的地址值一样的） */
    }
}
