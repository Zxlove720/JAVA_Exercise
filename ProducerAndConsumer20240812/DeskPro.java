package ProducerAndConsumer20240812;

public class DeskPro {
    private boolean flag;
    private int makeCount;
    private int eatCount;
    private int count;
    private final Object lock = new Object();

    public DeskPro() {
        this(false, 0, 0, 0);
    }

    public DeskPro(boolean flag, int makeCount, int eatCount, int count) {
        this.flag = flag;
        this.makeCount = makeCount;
        this.eatCount = eatCount;
        this.count = count;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public int getMakeCount() {
        return makeCount;
    }

    public void setMakeCount(int makeCount) {
        this.makeCount = makeCount;
    }

    public int getEatCount() {
        return eatCount;
    }

    public void setEatCount(int eatCount) {
        this.eatCount = eatCount;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Object getLock() {
        return lock;
    }
}
