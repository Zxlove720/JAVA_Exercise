package demo1;
import java.util.Scanner;
public class CheckLeapYear20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始的年份");
        int startYear = sc.nextInt();
        System.out.println("请输入结束的年份");
        int endYear = sc.nextInt();
        for (int i = startYear; i < endYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
                System.out.println(i + "是闰年");
            } else {
                continue;
            }
        }
    }
}
