package TimeTest20240716;

public class TimeTest {
    public static void main(String[] args) {
        long beginTime = System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            if (isPrime2(i)) {
                System.out.print("");
            }
        }
        long endingTime = System.currentTimeMillis();
        //System.out.println("算法1执行时间为" + (endingTime - beginTime) + "ms"); // 50203
        System.out.println("算法2执行时间为" + (endingTime - beginTime) + "ms"); // 105  千万级别2420ms
    }

    public static boolean isPrime1(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean isPrime2(int number) {
        int key = (int)Math.sqrt(number);
        for (int i = 2; i < key; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
