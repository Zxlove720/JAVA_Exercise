package InternetExercise20240815;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InternetExercise2 {
    public static void main(String[] args) throws UnknownHostException {
        // InetAddress
        // 此类表示Internet协议（IP）地址

        // static InetAddress getByName(String host) 确定主机名称的IP地址，主机名可以是机器名称，也可以是IP地址
        // String getHostName() 获取此IP地址的主机名
        // String getHostAddress() 返回文本显示中的IP地址字符串

        InetAddress ip1 =  InetAddress.getByName("WZB-OMEN");
        System.out.println(ip1.getHostAddress());
        InetAddress ip2 =  InetAddress.getByName("192.168.36.177");
        System.out.println(ip2.getHostName());
    }
}
