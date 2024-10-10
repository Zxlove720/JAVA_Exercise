package ListExercise20240724;
import java.util.*;
import java.util.function.Consumer;

public class ListExercise3 {
    public static void main(String[] args) {
        // List集合五种遍历方式
        // 1.迭代器 2.列表迭代器 3.增强for 4.Lambda表达式 5.普通for（这是List集合特有的，原理是List集合有索引）
        Scanner sc = new Scanner(System.in);
        // 先准备一个集合，然后进行遍历
        List<String> arrayList = new ArrayList<>();
        System.out.println("请输入集合中有几个元素");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            String element = sc.nextLine();
            arrayList.add(element);
        }
        iteratorPrint(arrayList);
        System.out.println("-----------------------------");
        listIteratorPrint(arrayList);
        System.out.println(arrayList);
        System.out.println("-----------------------------");
        forPrint(arrayList);
        System.out.println("-----------------------------");
        LambdaPrint(arrayList);
        System.out.println("-----------------------------");
        printArray(arrayList);

    }

    // 1.迭代器遍历
    public static <E>void iteratorPrint(List<E> arrayList) {
        Iterator<E> it = arrayList.iterator();
        while (it.hasNext()) {
            E str = it.next();
            System.out.println(str);
        }
    }

    // 2.列表迭代器遍历 在使用列表迭代器的时候，可以添加元素
    public static <E>void listIteratorPrint(List<E> arrayList) {
        ListIterator<E> it = arrayList.listIterator();
        while (it.hasNext()) {
            E str = it.next();
            System.out.println(str);
            if (str.equals("b")) {
                it.add((E)"zxl");
            }
        }
    }

    // 3.增强for
    public static <E>void forPrint(List<E> arrayList) {
        for (E e : arrayList) {
            System.out.println(e);
        }
    }

    // 4.Lambda表达式
    public static <E> void LambdaPrint(List<E> arrayList) {
        arrayList.forEach(s -> System.out.println(s));
//        arrayList.forEach(new Consumer<E>() {
//            @Override
//            public void accept(E e) {
//                System.out.println(e);
//            }
//        });
    }

    // 5.普通for
    public static <E> void printArray(List<E> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
    }
}
