package ListExercise20240724;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;
import java.util.function.Consumer;

// 集合遍历
public class ListExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Collection<String> arraylist = new ArrayList<>();
        System.out.println("集合中要存多少元素?");
        String n = sc.nextLine();
        for (int i = 0; i < Integer.parseInt(n); i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            String element = sc.nextLine();
            arraylist.add(element);
        }

        // 迭代器遍历
        Iterator<String> i = arraylist.iterator();
        while (i.hasNext()) { // 用hasNext方法判断当前位置还有没有元素可以取出
            String s = i.next(); // next方法是获得当前位置的元素，并且将迭代器对象移向下一个索引位置
            //i.remove("a"); // 迭代器中的删除方法，迭代器指针在哪个位置，就删除哪个位置的索引
            System.out.println(s);
        }
        System.out.println(arraylist);
        /* 迭代器使用细节：1.循环中只能使用一次next方法，因为若多次调用，在条件判断的时候，当前位置是有
                          元素的，所以会进入循环，但是多次next会导致Iterator指针多次移动，产生越界问题报错NoSuchElementException
                          2.迭代器遍历完毕之后，不会复位，相当于使用了一次之后就没用了，想要再次遍历则需要
                          再创造一个新的迭代器对象
                          3.迭代器遍历的过程中不能使用集合中的方法，否则报错ConcurrentModificationException（并发修改异常），在
                          遍历的过程中对集合进行了结构性的修改（如修改、添加元素等），这种修改是不允许的，所以说抛出异常，这种机制
                          也称为快速失败 */

        // 增强for遍历：JDK5之后出现的新的“技术”，其内部原理其实还是一个Iterator的迭代器
        // 使用条件：必须是要实现了Iterable接口的类才可以使用增强for遍历（因为内部原理是Iterator的迭代器） Collection继承了Iterable接口
        // 使用好处：可以简化数组和Collection集合的遍历
        for (String s : arraylist) { // s 就是每次从arraylist中取出的元素
            System.out.println(s);
        }

        // Lambda表达式forEach
        // 通过forEach方法，结合Lambda表达式进行遍历
        // 匿名内部类
        arraylist.forEach(new Consumer<String>() { // consumer（使用者），是个函数接口，可以使用Lambda表达式
            @Override
            public void accept(String s) {
                System.out.println("forEach " + s);
            }
        });
        // Lambda表达式
        arraylist.forEach((s)-> System.out.println("forEach " + s));

    }
}
