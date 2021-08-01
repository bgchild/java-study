package net.tcp;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * TCP通信的客户端:向服务器发送连接请求,给服务器发送数据,读取服务器回写的数据
 * 表示客户端的类:
 * java.net.Socket:此类实现客户端套接字（也可以就叫“套接字”）。套接字是两台机器间通信的端点。
 * 套接字:包含了IP地址和端口号的网络单位
 * <p>
 * 构造方法:
 * Socket(String host, int port) 创建一个流套接字并将其连接到指定主机上的指定端口号。
 * 参数:
 * String host:服务器主机的名称/服务器的IP地址
 * int port:服务器的端口号
 * <p>
 * 成员方法:
 * OutputStream getOutputStream() 返回此套接字的输出流。
 * InputStream getInputStream() 返回此套接字的输入流。
 * void close() 关闭此套接字。
 * <p>
 * 实现步骤:
 * 1.创建一个客户端对象Socket,构造方法绑定服务器的IP地址和端口号
 * 2.使用Socket对象中的方法getOutputStream()获取网络字节输出流OutputStream对象
 * 3.使用网络字节输出流OutputStream对象中的方法write,给服务器发送数据
 * 4.使用Socket对象中的方法getInputStream()获取网络字节输入流InputStream对象
 * 5.使用网络字节输入流InputStream对象中的方法read,读取服务器回写的数据
 * 6.释放资源(Socket)
 * 注意:
 * 1.客户端和服务器端进行交互,必须使用Socket中提供的网络流,不能使用自己创建的流对象
 * 2.当我们创建客户端对象Socket的时候,就会去请求服务器和服务器经过3次握手建立连接通路
 * 这时如果服务器没有启动,那么就会抛出异常ConnectException: Connection refused: connect
 * 如果服务器已经启动,那么就可以进行交互了
 */
public class TcpClient {
    private final static BufferedReader KEYBOARD = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        final Socket socket = new Socket("localhost", 233);
        final InputStream is = socket.getInputStream();
        final OutputStream os = socket.getOutputStream();
        final Scanner scanner = new Scanner(is);
        PrintStream out = new PrintStream(os);
        boolean f = true;
        while (f) {
            String input = getString("请输入消息：");
            out.println(input);
            if (scanner.hasNext()) {
                System.out.println(scanner.next());
            }
            if (("bye").equalsIgnoreCase(input)) {
                System.out.println(input + ".......");
                f = false;
            }
        }
        is.close();
        os.close();
        out.close();
        socket.close();
    }

    public static String getString(String prompt) throws IOException {
        System.out.println(prompt);
        String str = KEYBOARD.readLine();
        return str;
    }
}
