package ProducerAndConsumer20240812;

public class Desk {
    public static int eatCount = 0;
    public static int makeCount = 0;
    public static int count = 0;
    public static final Object lock = new Object();
    public static boolean flag = false;
}
