package TCPExercise20240815;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPSend {
    public static void main(String[] args) throws IOException {
        // Java对于TCP协议的网络提供了良好的封装，用Socket对象代表两端通信的端口，并通过Socket产生IO流进行网络通信

        // Java为客户端提供了Socket类，为服务器端提供了ServerSocket类

        // 构造方法
        // Socket(InetAddress address, int port) 创建流套接字，并连接到指定IP、指定端口号
        // Socket(String host, int port) 创建流套接字，并将其连接到指定主机上的指定端口号

        // 相关方法
        // InputStream getInputStream() 返回此套接字的输入流
        // OutputStream getOutputStream() 返回此套接字的输出流

        //TCP协议，发送数据

        //1.创建Socket对象
        //细节：在创建对象的同时会连接服务端
        // 如果连接不上，代码会报错
        Socket socket = new Socket("127.0.0.1",10086);
        //2.可以从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        //写出数据
        os.write("hello TCP".getBytes());
        //3.释放资源
        os.close();
        socket.close();
    }
}
