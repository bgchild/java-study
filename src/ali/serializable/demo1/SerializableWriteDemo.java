package ali.serializable.demo1;

import java.io.*;


/**
 * 序列化User类
 * 写入
 * @author laok
 * @date 2021/7/30
 */
public class SerializableWriteDemo {
    public static void main(String[] args) throws IOException {
        User user = new User();
        user.setName("ym");
        user.setAge(18);
        try (OutputStream outputStream = new FileOutputStream("src/leetcode/serializable/demo1/out");
             ObjectOutputStream oss = new ObjectOutputStream(outputStream)) {
             oss.writeObject(user);
        }
    }
}
