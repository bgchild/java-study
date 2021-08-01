package ali.io;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/**
 * @author laok
 * @date 2021/7/29
 */
public class NioTest {
    public static void main(String[] args) {
        writeNIO();
//        String pathname = "src/leetCode/io/out.txt";
//        FileInputStream fis = null;
//        File file = new File(pathname);
//
//        try {
//            fis = new FileInputStream(file);
//            FileChannel channel = fis.getChannel();
//            // 字节
//            int capacity = 100;
//            ByteBuffer bf = ByteBuffer.allocate(capacity);
//            System.out.println("限制是：" + bf.limit() + "容量是：" + bf.capacity()
//                    + "位置是：" + bf.position());
//            int length = -1;
//            while ((length = channel.read(bf)) != -1) {
//                /*
//                * 注意，读取后，将位置为 0，将 limit 置为容量, 以备下次读入到字节缓冲中，
//                从 0 开始存储
//                */
//                bf.clear();
//                byte[] bytes = bf.array();
//                System.out.write(bytes, 0, length);
//                System.out.println();
//                System.out.println("限制是：" + bf.limit() + "容量是：" + bf.capacity()
//                        + "位置是：" + bf.position());
//            }
//            channel.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (fis != null) {
//                try {
//                    fis.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }

    static void writeNIO() {
        String filename = "src/leetCode/io/out.txt";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(filename);
            FileChannel channel = fos.getChannel();
            ByteBuffer src = Charset.forName("utf8").encode("你好你好你好你好你好");
            // 字节缓冲的容量和 limit 会随着数据长度变化，不是固定不变的
            System.out.println("初始化容量和 limit：" + src.capacity() + "," + src.limit());
            int length = 0;
            while ((length = channel.write(src)) != 0) {
                /*
                 * 注意，这里不需要 clear，将缓冲中的数据写入到通道中后 第二次接着上一次的顺序往下读
                 */
            }
            System.out.println("写入长度:" + length);
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
