package UDPExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPExercise3Send {
    public static void main(String[] args) throws IOException {
        // 广播实现
        // 发送端
        // 1.创建发送端Socket对象（DatagramSocket）
        // 2.创建存储数据的箱子，将广播地址封装进去
        // 3.发送数据
        // 4.释放资源

        // 接收端
        // 1.创建接收端对象（DatagramSocket）
        // 2.创建一个数据包，用于接收数据
        // 3.调用DatagramSocket对象中的方法接收数据
        // 4.解析数据包，将数据在控制台显示
        // 5.关闭接收端

        // 1.创建发送端Socket对象
        DatagramSocket datagramSocket = new DatagramSocket();
        // 2.创建存储数据的箱子，将广播地址封装进去
        String message = "hello 广播";
        byte[] bytes = message.getBytes();
        InetAddress address = InetAddress.getByName("255.255.255.255");
        int port = 10000;
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, address, port);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
