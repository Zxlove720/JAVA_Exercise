package ArrayToString20240706;
import java.util.Scanner;
import java.util.StringJoiner;

public class ArrayToString2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.printf("请输入第%d个元素", i + 1);
            array[i] = sc.nextInt();
        }
        boolean flag = checkArray(array);
        if (flag) {
            StringJoiner sj = new StringJoiner(", ", "[", "]");
            for (int i = 0; i < array.length; i++) {
                sj.add(array[i] + "");
            }
            String str = sj.toString();
            System.out.println(str);

        } else {
            System.out.println("无效数组");
        }
    }


    public static boolean checkArray(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        return true;
    }
}
