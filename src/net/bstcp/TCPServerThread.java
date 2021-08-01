package net.bstcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 创建BS版本TCP服务器
 */
public class TCPServerThread {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket,和系统要指定的端口号
        ServerSocket server = new ServerSocket(233);
        /**
         *  浏览器解析服务器回写的html页面,页面中如果有图片,那么浏览器就会单独的开启一个线程,读取服务器的图片
         *  我们就的让服务器一直处于监听状态,客户端请求一次,服务器就回写一次
         */
        while (true) {
            //使用accept方法获取到请求的客户端对象(浏览器)
            Socket socket = server.accept();
            new Thread(() -> {
                try {
                    final InputStream is = socket.getInputStream();
                    OutputStream os = socket.getOutputStream();
                    PrintStream out = new PrintStream(os);
                    final Scanner scanner = new Scanner(is);
                    boolean f = true;
                    while (f) {
                        if (scanner.hasNext()) {
                            String msg = scanner.next();
                            if (("bye").equalsIgnoreCase(msg)) {
                                System.out.println(msg + ".......");
                                f = false;
                            } else {
                                out.println("【接收到消息】" + msg);
                                System.out.println("【接收到消息】" + msg);
                            }
                        }
                    }
                    is.close();
                    os.close();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }


        //server.close();
    }
}
