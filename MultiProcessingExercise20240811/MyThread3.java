package MultiProcessingExercise20240811;

import java.io.IOException;
import java.util.concurrent.Callable;

public class MyThread3 implements Callable<Integer> {
    @Override
    public Integer call() throws IOException {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            sum += i;
        }
        return sum;
    }

}
