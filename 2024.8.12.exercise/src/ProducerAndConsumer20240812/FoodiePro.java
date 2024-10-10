package ProducerAndConsumer20240812;

public class FoodiePro implements Runnable {
    private DeskPro desk;

    public FoodiePro (DeskPro desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getEatCount() == 10) {
                    // 吃了10个吃饱了
                    break;
                } else {
                    if (desk.isFlag()) {
                        // 此时桌子上有汉堡，顾客开始吃汉堡
                        int eatCount = desk.getEatCount();
                        desk.setEatCount(++eatCount);
                        System.out.println(Thread.currentThread().getName() + "正在吃第" + desk.getEatCount() + "个汉堡");
                        int count = desk.getCount();
                        desk.setCount(--count);
                        if (desk.getCount() == 0) {
                            desk.setFlag(false);
                        }
                        // 叫醒厨师来做汉堡
                        desk.getLock().notifyAll();
                    } else {
                        // 此时桌子上没有汉堡，顾客等待厨师做汉堡
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}
