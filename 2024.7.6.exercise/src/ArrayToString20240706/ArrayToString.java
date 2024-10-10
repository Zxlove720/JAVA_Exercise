package ArrayToString20240706;
import java.util.Scanner;
import java.util.StringJoiner;

public class ArrayToString {
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
            StringBuilder sb = creatStringBuilder(array);
            String str = sb.toString();
            System.out.println(str);

        } else {
            if (array.length == 0)
            {
                System.out.println("[]");
            } else {
                System.out.println("数组非法");
            }
        }
    }

    public static boolean checkArray(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        return true;
    }

    public static StringBuilder creatStringBuilder(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                sb.append(array[i]);
            } else {
                sb.append(array[i]);
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb;
    }

}
