package ListExercise20240724;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAndSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Set和List都是List的实现类，但有所差异；一般而言，List集合是有序的（怎么存的怎么取），Set是无序的（存取无序）
        // List集合可以存在重复的元素，而Set集合不可以；List集合是有索引的，可以通过索引来获得元素，而Set是没有索引的

        // 因为List集合存在索引，所以说围绕其索引，产生了许多特殊的List特有的方法

        List<String> arrayList = new ArrayList<>();
        // 这里写多态必须写List而不能写Collection，因为Collection是父接口，必须包含List和Set中的共同方法，所以说就没有List独有的方法
        System.out.println("需要添加几个元素?");
        String n = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            String element = sc.nextLine();
            arrayList.add(element); // 这里是普通的添加，就是按照顺序添加元素
        }
        insertElement(arrayList);
        System.out.println(arrayList);
        insertElement(arrayList);
        System.out.println(arrayList);
        removeElement(arrayList);
        System.out.println(arrayList);
        removeElement(arrayList);
        System.out.println(arrayList);
        System.out.println(arrayList);
    }

    // 1. void add(int index, E element) 在集合的指定索引处插入元素
    public static <E>void insertElement(List<E> arrayList) { // 方法参数写多态
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要添加元素的索引");
        String index = sc.nextLine();
        System.out.println("请输入想要添加的元素");
        String element = sc.nextLine();
        E e = (E)element;
        arrayList.add(Integer.parseInt(index), e);
    }

    // 2. E remove(int index) 删除指定索引的元素，返回被删除的元素
    public static <E> E removeElement(List<E> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要删除元素的索引");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index >= arrayList.size()) {
            return null;
        }
        return (E)arrayList.remove(index);
    }

    // 3. E set(int index, E element) 修改指定索引的元素，返回被修改的元素
    public static <E> E setElement(List<E> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入想要修改的元素的索引");
        int index = Integer.parseInt(sc.nextLine());
        if (index < 0 || index >= arrayList.size()){
            System.out.println("索引无效");
            return null;
        }
        System.out.println("请输入想要修改的内容");
        String element = sc.nextLine();
        E e = (E)element;
        return (E)arrayList.set(index, e);
    }
}
