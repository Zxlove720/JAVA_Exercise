//已知2019年是猪年，请在控制台输出从1949年到2019年中所有是猪年的年份。
package demo1;
import java.util.Scanner;
public class CheckPigYear20240703 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入起始年份");
        int startYear = sc.nextInt();
        System.out.println("请输入末尾年份");
        int endYear = sc.nextInt();
        for (int i = endYear; i >= startYear; i -= 12) {
            System.out.println(i + " ");
        }
    }
}
