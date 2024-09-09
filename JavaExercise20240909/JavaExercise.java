package JavaExercise20240909;

import java.util.LinkedList;

public class JavaExercise {
    public static void main(String[] args) {
        // 创建一个LinkedList
        LinkedList<String> fruits = new LinkedList<>();

        // 添加元素到LinkedList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        // 打印LinkedList
        System.out.println("LinkedList: " + fruits);

        // 获取并打印第一个元素
        String firstElement = fruits.getFirst();
        System.out.println("First Element: " + firstElement);

        // 获取并打印最后一个元素
        String lastElement = fruits.getLast();
        System.out.println("Last Element: " + lastElement);

        // 移除第一个元素
        fruits.removeFirst();
        System.out.println("After removing first element: " + fruits);

        // 移除最后一个元素
        fruits.removeLast();
        System.out.println("After removing last element: " + fruits);
    }
}

