package Exercise20240723;
import java.util.Scanner;
import java.util.ArrayList;
public class Exercise1 {
    public static void main(String[] args) {
        /* 需求：
        键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。 */
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int result;
        while (true) {
            result = getSum(arrayList);
            if (result > 200) {
                System.out.println("已经超过两百，现在集合的和是" + result);
                break;
            }
            System.out.println("请输入1个整数");
            int number = sc.nextInt();
            if (rightNumber(number)) {
                arrayList.add(number);
            } else {
                System.out.println("整数不和规范，请重新输入");
            }
        }
    }

    public static boolean rightNumber(int number) {
        if (number >= 1 && number <= 100 ) {
            return true;
        }
        return false;
    }

    public static int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;
        for (Integer i : arrayList) {
            sum += i;
        }
        return sum;
    }
}
