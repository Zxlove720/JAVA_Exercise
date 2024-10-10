package UDPExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPExercise1Receive {
    public static void main(String[] args) throws IOException {
        //接收端
        DatagramSocket datagramSocket = new DatagramSocket(10086);

        byte[] bytes = new byte[1024];

        DatagramPacket datagramPacket;

        while (true) {
            datagramPacket = new DatagramPacket(bytes, bytes.length);
            datagramSocket.receive(datagramPacket);
            String result = new String(datagramPacket.getData(), 0 , datagramPacket.getLength());
            if (result.equals("886")) {
                break;
            } else {
                System.out.println("用户：" + result);
            }
        }
        datagramSocket.close();
    }
}
