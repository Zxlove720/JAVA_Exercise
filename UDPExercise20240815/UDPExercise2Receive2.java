package UDPExercise20240815;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class UDPExercise2Receive2 {
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

        // 注意：组播地址应该在224.0.0.0 - 239.255.255.255之间，否则是无效的组播地址
    }
}
