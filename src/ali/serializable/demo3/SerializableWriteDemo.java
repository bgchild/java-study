package ali.serializable.demo3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @author laok
 * @date 2021/7/30
 */
public class SerializableWriteDemo {
    public static void main(String[] args) throws IOException {
        //Initializes The Object
        User user = new User();
        user.setName("ym");
        //Write Obj to File
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/leetcode/serializable/demo3/tempFile"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
    }
}
