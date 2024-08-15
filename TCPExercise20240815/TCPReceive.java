package TCPExercise20240815;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceive {
    public static void main(String[] args) throws IOException {
        // TCP接收数据
        // 构造方法 ServletSocket(int port) 创建绑定到指定端口的服务器套接字
        // 相关方法 Socket accept() 监听要连接到此的套接字并接收它

        // 注：
        // 1.accept方法是阻塞的,作用就是等待客户端连接
        // 2.客户端创建对象并连接服务器,此时是通过三次握手协议,保证跟服务器之间的连接
        // 3.针对客户端来讲,是往外写的,所以是输出流；针对服务器来讲,是往里读的,所以是输入流
        // 4.read方法是阻塞的
        // 5.客户端在关流的时候,还多了一个往服务器写结束标记的动作
        // 6.最后一步断开连接,通过四次挥手协议保证连接终止

        //TCP协议，接收数据

        //1.创建对象ServerSocket
        ServerSocket ss = new ServerSocket(10086);

        //2.监听客户端的链接
        Socket socket = ss.accept();

        //3.从连接通道中获取输入流读取数据
        InputStream is = socket.getInputStream();
        int b;
        while ((b = is.read()) != -1){
            System.out.print((char) b);
        }

        //4.释放资源
        socket.close();
        ss.close();
    }
}
