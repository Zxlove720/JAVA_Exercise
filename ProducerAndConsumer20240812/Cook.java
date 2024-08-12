package ProducerAndConsumer20240812;

public class Cook implements Runnable{
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if (Desk.makeCount == 10) {
                    break;
                } else {
                    if (Desk.flag) {
                        // 此时表示有汉堡
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        // 此时表示没有汉堡包了
                        Desk.makeCount++;
                        System.out.println(Thread.currentThread().getName() +  "正在生产第" + Desk.makeCount +"汉堡包");
                        Desk.count++;
                        System.out.println("桌子上现在有" + Desk.count + "个汉堡包");
                        if (Desk.count > 0) {
                            Desk.flag = true;
                        }
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
