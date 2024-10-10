package ProducerAndConsumer20240812;

public class CookPro implements Runnable {
    private DeskPro desk;

    public CookPro(DeskPro desk) {
        this.desk = desk;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (desk.getLock()) {
                if (desk.getMakeCount() == 10) {
                    break;
                } else {
                    if (desk.isFlag()) {
                        // 此时桌子上面有汉堡包，厨师等待
                        try {
                            desk.getLock().wait();
                        } catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    } else {
                        // 此时桌子上面没有汉堡包，厨师开始做汉堡
                        int makeCount = desk.getMakeCount();
                        desk.setMakeCount(++makeCount);
                        System.out.println(Thread.currentThread().getName() + "正在做第" + desk.getMakeCount() + "个汉堡包");
                        int count = desk.getCount();
                        desk.setCount(++count);
                        if (desk.getCount() > 0) {
                            desk.setFlag(true);
                        }
                        // 叫醒顾客来吃汉堡
                        desk.getLock().notifyAll();
                    }
                }
            }
        }
    }
}
