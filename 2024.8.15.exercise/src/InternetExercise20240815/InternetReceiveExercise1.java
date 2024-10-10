package InternetExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class InternetReceiveExercise1 {
    public static void main(String[] args) throws IOException {
        // UDP接收数据
        // 接收数据的步骤
        // 1.创建接收端的Socket对象（DatagramSocket）
        // 2.创建一个数据包，用于接收数据
        // 3.调用DatagramSocket对象中的方法接收数据
        // 4.解析数据包，并将数据在控制台显示

        // 构造方法
        // DatagramPacket(byte[] buf, int len) 创建一个DatagramPacket用于接收长度为len的数据包
        // 相关方法
        // byte[] getData() 返回数据缓冲区
        // int getLength() 返回要发送的数据的长度或者接收的数据的长度

        // 创建接收端的Socket对象（DatagramSocket）
        DatagramSocket datagramSocket = new DatagramSocket(10086);
        // 创建一个数据包，用于接收数据
        byte[] bytes = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
        // 调用DatagramSocket对象的方法接收数据
        datagramSocket.receive(datagramPacket);
        // 解析数据包，并将数据在控制台显示
        System.out.println("接收到的数据是：" + new String(datagramPacket.getData(), 0, datagramPacket.getLength()));

        // 注：
        // 1.必须先启动接收端的程序再启动发送端的程序
        // 2.发送端和接收端的接口必须一致
    }
}
