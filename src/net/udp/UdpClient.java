package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * udp客户端
 * @author laok
 */
public class UdpClient {
    public static void main(String[] args) throws IOException {
        //连接到9999端口
        DatagramSocket client = new DatagramSocket(9999);
        byte[] data = new byte[1024];
        //接受数据
        DatagramPacket packet = new DatagramPacket(data, data.length);
        System.out.println("客户端等待接收发送的消息...");
        client.receive(packet);
        System.out.println(new String(data, 0, packet.getLength()));
        client.close();
    }
}
