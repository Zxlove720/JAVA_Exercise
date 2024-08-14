package MultiProcessingExercise220240814;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;

public class Lottery implements Callable<Integer> {
    ArrayList<Integer> pool = new ArrayList<>();

    public Lottery(ArrayList<Integer> pool) {
        this.pool = pool;
    }

    @Override
    public Integer call() throws InterruptedException {
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            synchronized (Lottery.class) {
                if (pool.size() == 0) {
                    System.out.println(Thread.currentThread().getName() + list);
                    break;
                } else {
                    Collections.shuffle(pool);
                    int prize = pool.removeFirst();
                    list.add(prize);
                }
            }
            Thread.sleep(10);
        }
        //把集合中的最大值返回
        if(list.isEmpty()){
            return null;
        }else{
            return Collections.max(list);
        }
    }
}
