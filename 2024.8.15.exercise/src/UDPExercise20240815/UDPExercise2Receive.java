package UDPExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPExercise2Receive {
    public static void main(String[] args) throws IOException {
        // 组播接收端
        // 创建组播接收端的Socket对象（MulticastSocket）
        MulticastSocket multicastSocket = new MulticastSocket(10086);
        // 创建一个箱子用于接收数据
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1024], 1024);
        // 将当前计算机绑定一个组播地址，表示添加到这一组中
        multicastSocket.joinGroup(InetAddress.getByName("224.0.1.0"));
        // 将数据接收到箱子中
        multicastSocket.receive(datagramPacket);
        // 解析数据包并答应数据
        byte[] data = datagramPacket.getData();
        int length = datagramPacket.getLength();
        System.out.println(new String(data, 0, length));
        // 释放资源
        multicastSocket.close();

        // 注：
        // 1.组播地址应该在224.0.0.0 - 239.255.255.255之间，否则是无效的组播地址
        // 2.接收端加入一个组播组，监听特定的组播地址和端口。网络设备（如路由器）会将发送到该组播地址的数据包转发给所有加入该组的接收端。
        // 3.端口共享：多个接收端可以在同一个端口上接收来自同一个组播地址的数据包，而不会产生端口冲突。这是因为组播协议允许多个应用程序在同一个端口上接收数据。

    }
}
