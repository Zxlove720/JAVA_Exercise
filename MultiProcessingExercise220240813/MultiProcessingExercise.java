package MultiProcessingExercise220240813;

public class MultiProcessingExercise {
    public static void main(String[] args) {
        /*
            需求：
            有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出
            利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
        */

        GIft gift = new GIft();
        Thread thread1 = new Thread(gift, "人1");
        Thread thread2 = new Thread(gift, "人2");

        thread1.start();
        thread2.start();
    }
}
