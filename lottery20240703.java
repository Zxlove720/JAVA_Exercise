package demo1;
import java.util.Random;
import java.util.Scanner;
public class lottery20240703 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你准备了多少奖项");
        int n = sc.nextInt();
        int[] rewarding = new int[n];
        for (int i = 0; i < rewarding.length; i++) {
            System.out.printf("请输入第%d项奖金", i + 1);
            rewarding[i] = sc.nextInt();
        }
        lottery(rewarding);
    }
    public static void lottery(int[] rewarding){
        Random r = new Random();
        int[] markArray = new int[rewarding.length];
        for (int i = 0; i < markArray.length; i++) {
            markArray[i] = 0;
        }
        int i = 0;
        while(i < rewarding.length){
            int randNumber = r.nextInt(rewarding.length);
            if(markArray[randNumber] == 0){
                markArray[randNumber] = 1;
                System.out.println(rewarding[randNumber] + "被抽到");
                i++;
            }
        }
    }
}
