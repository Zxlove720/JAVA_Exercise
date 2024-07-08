package ArrayListDemo20240708;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入有多少个字符串元素?");
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("请输入第%d个元素\n", i + 1);
            str[i] = sc.next();
        }
        ArrayList<String> arrayList = new ArrayList<>();
        // 添加至集合中
        for (int i = 0; i < str.length; i++) {
            arrayList.add(str[i]);
        }
        // 从集合中读取
        System.out.print("[");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) {
                System.out.print(arrayList.get(i));
            } else {
                System.out.print(arrayList.get(i) + ", ");
            }
        }
        System.out.println("]");
    }
}
