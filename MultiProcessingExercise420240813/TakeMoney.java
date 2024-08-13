package MultiProcessingExercise420240813;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.chrono.MinguoChronology;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class TakeMoney implements Runnable {
    // 创建红包金额，用BigDecimal，方便控制红包金额的格式
    private BigDecimal money = BigDecimal.valueOf(100.0);
    // 创建最小金额，每次抢红包的金额最小只能是它
    private final BigDecimal MIN_MONEY = BigDecimal.valueOf(0.01);
    // 创建红包个数
    private int count = 3;
    // 创建锁
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        // 每次只要有线程抢到资源直接上锁
        lock.lock();
        // 创建每次抢红包的金额
        BigDecimal prize;
        try {
            if (count == 0) {
                // 红包已经没有了，所以说该线程没有抢到红包
                System.out.println(Thread.currentThread().getName() + "没有抢到红包");
            } else {
                if (count == 1) {
                    // 此时还剩一个红包，不需要随机金额了，此次抢的金额就是剩下的money
                    prize = money;
                    // 输出信息
                    System.out.println(Thread.currentThread().getName() + "成功抢到" + prize + "元");
                    // 红包个数-1
                    count--;
                } else {
                    // 此时红包个数＞1，所以说需要随机金额
                    Random r = new Random();
                    // 创建金额的范围变量bounds
                    // 用money - ((count - 1) * MIN_MONEY) 的值，就可以得到每次红包金额的上界，因为是BigDecimal参与运算，所以说使用方法运算
                    double bounds = money.subtract(BigDecimal.valueOf(count - 1).multiply(MIN_MONEY)).doubleValue();
                    // 产生随机金额作为本次抢到的值
                    prize = BigDecimal.valueOf(r.nextDouble(bounds));
                    // 将随机的金额格式化（四舍五入）
                    prize = prize.setScale(2, RoundingMode.HALF_UP);
                    // 特殊情况判断
                    if (prize.compareTo(MIN_MONEY) < 0) {
                        // 假如prize的值不幸随机到0，那么就使其变为最小金额MIN_MONEY
                        prize = MIN_MONEY;
                    }
                    // 从money中减去本次抢到的金额prize
                    money = money.subtract(prize); // BigDecimal中的运算会产生一个新的BigDecimal对象
                    // 红包个数-1
                    count--;
                    // 输出信息
                    System.out.println(Thread.currentThread().getName() + "成功抢到" + prize + "元");
                }
            }
        } finally {
            // 解锁
            lock.unlock();
        }
    }
}
