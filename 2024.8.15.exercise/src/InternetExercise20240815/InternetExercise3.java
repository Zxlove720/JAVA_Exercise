package InternetExercise20240815;

import java.io.IOException;
import java.net.*;

public class InternetExercise3 {
    public static void main(String[] args) throws IOException {
        // 端口
        /* 用两个字节表示的整数，取值范围是0-65535，但是，其中0-1023的端口号被一些知名的网络服务和应用占用，所以说
        普通的应用需要使用1024以上的端口号；如端口号被另外一个服务或应用占用，会导致当前应用程序启动失败 */

        // 协议：计算机网络中连接和通信的规则被称为网络通信协议
        // UDP协议（User Datagram Protocol） 用户数据报协议
        /*
        UDP是无连接通信协议，即在数据传输时，数据的发送端和接收端不建立逻辑连接。简单来说，当一台计算机向另外一台计算机发送数据时，
        发送端不会确认接收端是否存在，就会发出数据，同样接收端在收到数据时，也不会向发送端反馈是否收到数据。
        由于以上特性，导致UDP协议消耗系统资源小，通信效率高，所以通常都会用于音频、视频和普通数据的传输
        例如：视频会议通常采用UDP协议，因为这种情况即使偶尔丢失一两个数据包，也不会对接收结果产生太大影响。
        但是在使用UDP协议传送数据时，由于UDP的面向无连接性，不能保证数据的完整性，因此在传输重要数据时不建议使用UDP协议
         */

        // TCP协议（Transmission Control Protocol） 传输控制协议
        /*
        TCP协议是面向连接的通信协议，即传输数据之前，在发送端和接收端建立逻辑连接，然后再传输数据，简单而言，先连接成功再传输
        它提供了两台计算机之间可靠无差错的数据传输。在TCP连接中必须要明确客户端与服务器端————
        由客户端向服务端发出连接请求，每次连接的创建都需要经过“三次握手”，完成三次握手，连接建立后，客户端和服务器才可以进行数据传输
        由于这种面向连接的特性，TCP协议可以保证传输数据的安全，所以应用十分广泛。例如上传文件、下载文件、浏览网页等（保证数据的完整、安全性）
        */


        // UDP通信程序
        // UDP发送数据
        /* Java中的UDP通信：UDP协议是一种不可靠的网络协议，其通信的两端分别建立一个Socket对象，但是这两个Socket对象只负责发送、接收数据
        所以基于UDP协议通信的双方而言，其并不是所谓的客户端和服务器 */
        // Java中提供了DatagramSocket类作为基于UDP协议的Socket

        // Datagram
        // 构造方法
        // DatagramSocket() 创建数据报套接字并将其绑定于本机地址上任何可用的端口  DatagramSocket（数据报套接字）
        // DatagramPacket(byte[] buf, int len, InetAddress add, int port) 创建数据包，发送长度为len的数据包到指定主机的端口

        // 相关方法：
        // void send(DatagramPacket p) 发送数据报包
        // void close() 关闭数据报套接字
        // void receive(DatagramPacket p) 从此套接字接收数据报包

        // 发送数据的步骤
        // 1.创建发送端的Socket对象（DatagramSocket）
        // 2.创建数据，并将数据打包
        // 3.调用DatagramSocket对象中的方法发送数据
        // 4.关闭发送端

        // 创建数据报套接字并将其绑定到本地主机上任何可用的端口
        DatagramSocket datagramSocket = new DatagramSocket();
        // 创建数据并将其打包
        byte[] data = "hello UDP".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(data, data.length, InetAddress.getByName("127.0.0.1"), 10086);
        // 调用send方法发送数据
        datagramSocket.send(datagramPacket);
        // 关闭发送端
        datagramSocket.close();

        // 注：
        // 1.必须先启动接收端的程序再启动发送端的程序
        // 2.发送端和接收端的接口必须一致
    }
}
