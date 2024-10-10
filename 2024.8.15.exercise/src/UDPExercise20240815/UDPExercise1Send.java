package UDPExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Scanner;

public class UDPExercise1Send {
    public static void main(String[] args) throws IOException {
        // UDP通信程序练习
        // 需求：

        /*
        UDP发送数据：数据来自于键盘录入，直到输入的数据是886，发送数据结束
        UDP接收数据：因为接收端不知道发送端什么时候停止发送，故采用死循环接收
        */

        // 发送端
        Scanner sc = new Scanner(System.in);
        DatagramSocket datagramSocket = new DatagramSocket();
        DatagramPacket datagramPacket;
        byte[] bytes; // 无需分配其大小，Java每次使用时会对其进行动态内存分配，分配一个合理的大小
        while (true) {
            System.out.println("请输入你想要发送的内容:");
            String message = sc.nextLine();
            if (message.equals("886")) {
                bytes = "886".getBytes();
                datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 10086);
                // 其构造方法：需要一个字节数组代表发送的数据，指出发送多少数据，IP地址，端口号
                datagramSocket.send(datagramPacket);
                break;
            } else {
                bytes = message.getBytes();
                datagramPacket = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("127.0.0.1"), 10086);
                datagramSocket.send(datagramPacket);
            }
        }
        datagramSocket.close();
    }
}
