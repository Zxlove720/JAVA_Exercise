package ProducerAndConsumer20240812;

public class Foodie implements Runnable {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.eatCount == 10) {
                    break;
                } else {
                    if (Desk.flag) {
                        // 此时是有汉堡的，顾客可以开始吃
                        Desk.eatCount++;
                        System.out.println(Thread.currentThread().getName() +  "正在吃第" + Desk.eatCount +"汉堡包");
                        Desk.count--;
                        System.out.println("桌子上现在有" + Desk.count + "个汉堡包");
                        if (Desk.count == 0) {
                            Desk.flag = false;
                        }
                        Desk.lock.notifyAll();
                    } else {
                        // 此时是没有汉堡的，顾客进入等待
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
