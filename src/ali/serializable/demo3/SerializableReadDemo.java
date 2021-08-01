package ali.serializable.demo3;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

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
                InputStream in = new FileInputStream("src/leetcode/serializable/demo3/tempFile");
                ObjectInputStream ois = new ObjectInputStream(in);
        ) {
            User user = (User) ois.readObject();
            System.out.println(user.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
