package MultiProcessingExercise520240813;

import java.util.ArrayList;
import java.util.Collections;

public class MultiProcessingExercise5 {
    public static void main(String[] args) {
        // 需求：
        // 有一个抽奖池,该抽奖池中存放了奖励的金额,该抽奖池中的奖项为 {10,5,20,50,100,200,500,800,2,80,300,700};
        // 创建两个抽奖箱(线程)设置线程名称分别为“抽奖箱1”，“抽奖箱2”
        // 随机从抽奖池中获取奖项元素并打印在控制台上,格式如下:
        // 每次抽出一个奖项就打印一个(随机)

        ArrayList<Integer> award = new ArrayList<>();
        // 加入无奖
        for (int i = 0; i < 100; i++) {
            award.add(0);
        }
        Collections.addAll(award, 10,5,20,50,100,200,500,800,2,80,300,700);
        Lottery lottery = new Lottery(award);

        Thread thread1 = new Thread(lottery, "抽奖箱1");
        Thread thread2 = new Thread(lottery, "抽奖箱2");

        thread1.start();
        thread2.start();
    }
}
