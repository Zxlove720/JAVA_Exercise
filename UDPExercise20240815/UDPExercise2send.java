package UDPExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPExercise2send {
    public static void main(String[] args) throws IOException {
        // UDP有三种通讯方式
        // 1.单播：用于两个主机之间的端对端的通信
        // 2.组播：用于对一组特定主机进行通信
        // 3.广播：用于一个主机对整个局域网上所有主机的数据通信

        // UDP组播实现
        // 步骤：
        // 一、发送端
        // 1.创建发送端的Socket对象（DatagramSocket）
        // 2.创建数据，并将数据打包（DatagramPacket）
        // 3.调用DatagramSocket对象的方法发送数据（单播中是发给指定IP的电脑；但是组播中是发给组播地址）
        // 4.释放资源

        // 二、接收端
        // 1.创建一个接收端的Socket对象（MulticastSocket）
        // 2.创建一个箱子，用于接收数据（单播可以用包，组播需要使用箱子）
        // 3.将当前计算机绑定一个组播的地址
        // 4.将接收的数据放在箱子中
        // 5.解析数据包，并打印数据
        // 6.释放资源

        // 创建发送端的Socket对象（DatagramSocket）
        DatagramSocket datagramSocket = new DatagramSocket();
        String message = "hello 组播";
        byte[] bytes = message.getBytes();
        InetAddress ip = InetAddress.getByName("224.0.1.0");
        int port = 10086;
        // 创建数据，并将数据打包（DatagramPacket）
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, ip, port);
        // 调用方法发送数据
        datagramSocket.send(datagramPacket);
        // 释放资源
        datagramSocket.close();
    }
}
