package CollectionExercise20240728;

import java.util.Iterator;
import java.util.List;

public class CollectionExercise1 {
    public static void main(String[] args) {
        // 不可变集合（不能对集合长度，内容进行任何修改）
        // 当要处理一些不想被修改的数据的时候，可以将其拷贝到不可变集合中使用
        // 当集合对象被不可信的库调用时，不可变的形式是安全的

        // 不可变List集合
        // 用List中of方法创建不可变List集合
        List<String> nameList = List.of("张三", "李四", "王五", "赵六", "钱七", "周八");

        // 元素成功加入List集合中
        Iterator<String> it = nameList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 对其进行修改
        nameList.add("小明"); // 编译时会报警告：不可变对象已被修改
        nameList.remove(2); // 运行时直接报错：UnsupportedOperationException
        nameList.remove("张三"); // 证明了该集合是不可变的集合
    }
}
