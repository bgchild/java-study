package net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * udp服务端
 *
 * @author laok
 */
public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket server = new DatagramSocket(9000);
        String msg = "zhxdj";
        server.send(new DatagramPacket(msg.getBytes(StandardCharsets.UTF_8), 0, msg.length(), InetAddress.getByName("localhost"), 9999));
        System.out.println("消息发送完毕...");
        server.close();
    }
}
