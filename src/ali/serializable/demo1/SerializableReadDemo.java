package ali.serializable.demo1;

import java.io.*;

/**
 * 序列化User类
 * 读取
 *
 * @author laok
 * @date 2021/7/30
 */
public class SerializableReadDemo {
    public static void main(String[] args) throws IOException {
        try (
                InputStream in = new FileInputStream("src/leetcode/serializable/demo1/out");
                ObjectInputStream ois = new ObjectInputStream(in);
        ) {
            User user = (User) ois.readObject();
            System.out.println(user.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
