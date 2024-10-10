package MultiProcessingExercise620240813;

import java.util.ArrayList;
import java.util.Collections;

public class MultiProcessingExercise6 {
    public static void main(String[] args) {
        // 需求：
        // 每次抽的过程中，不打印，抽完时一次性打印(随机)
        // 在此次抽奖过程中，抽奖箱1总共产生了6个奖项。
        // 分别为：10,20,100,500,2,300最高奖项为300元，总计额为932元
        // 在此次抽奖过程中，抽奖箱2总共产生了6个奖项。
        // 分别为：5,50,200,800,80,700最高奖项为800元，总计额为1835元

        ArrayList<Integer> pool = new ArrayList<>();
        // 加入无奖
        for (int i = 0; i < 500; i++) {
            pool.add(0);
        }
        // 加入奖项
        Collections.addAll(pool, 10,5,20,50,100,200,500,800,2,80,300,700);


        Lottery lottery = new Lottery(pool);

        Thread thread1 = new Thread(lottery, "抽奖箱1");
        Thread thread2 = new Thread(lottery, "抽奖箱2");

        thread1.setPriority(5);
        thread2.setPriority(6);

        thread1.start();
        thread2.start();
    }
}
