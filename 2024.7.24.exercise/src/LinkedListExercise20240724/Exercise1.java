package LinkedListExercise20240724;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        // ArrayList和LinkedList
        // ArrayList底层是数组实现的，查询快，增删慢
        // LinkedList底层是链表实现的，查询慢，增删块

        // LinkedList因为底层是链表，所以说头尾节点都是十分重要的，所以说对头尾节点有特殊的功能
        List<Integer> linkList = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            int element = r.nextInt(20) + 1;
            linkList.add(element);
        }
        System.out.println(linkList);
        System.out.println("---------------------------");
        // 分别在列表开头和结尾插入新的元素
        linkList.addFirst(45);
        linkList.addLast(54);
        System.out.println(linkList);
        System.out.println("---------------------------");
        // 返回列表开头和结尾的元素
        System.out.println(linkList.getFirst());
        System.out.println(linkList.getLast());
        System.out.println("---------------------------");
        // 删除并返回列表开头和结尾的元素
        System.out.println(linkList.removeFirst());
        System.out.println(linkList.removeLast());
        System.out.println(linkList);
    }
}
