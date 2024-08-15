package InternetExercise20240815;

public class InternetExercise1 {
    public static void main(String[] args) {
        // 网络编程
        // 在网络通信协议下，不同计算机上面运行的程序，可以实现不同计算机上的数据传输

        // 网络编程三要素
        // 1.IP地址
        /* 想要在网络中实现计算机的互相通信，必须给每一台计算机指定一个标识号，通过标识号指定要收取数据的计算机和识别
        发送数据的计算机，IP则是这个标识号，就是网络空间中计算机的重要标识 */

        // 2.端口
        /* 网络的通信，本质上是两个应用程序的通信，每台计算机中都有很多的应用程序，在实现网络通信时，为了区分这些应用程序
        引入了端口号，端口号可以用来标识设备中的应用程序，IP地址可以唯一标识网络中的设备，端口号唯一标识设备中的应用程序 */

        // 3.协议
        /* 计算机网络可以使多台计算机实现链接，位于同一个网络中的计算机在进行连接和通信时需要遵守规则，这个规则就是网络通信协议
        在计算机网络中，链接和通信的规则称为网络通信协议，其对于数据传输格式、传输速率、传输步骤做了统一规定，通信双方必须同时
        遵守一样的协议才可以完成数据交换，常见的协议有UDP协议和TCP协议 */

        // IP地址
        /* IPV4：给每个连接在网络上的主机分配一个32bit的地址，根据TCP/IP规定：IP地址使用二进制表示，每个IP地址长32bit，为了
        方便使用，IP地址常被写成十进制的形式，中间使用“.”分隔，如：192.168.1.66，这种表示方法称为点分十进制表示法 */

        /* IPV6：IPV4的地址不够现在使用，于是引入IPV6，采用128bit的地址，16字节为1组，分为8组十六进制数，成功解决IP地址紧张问题 */
        // 特殊IP：127.0.0.1：回送地址，可以代表本机地址，一般是测试时使用
    }
}
