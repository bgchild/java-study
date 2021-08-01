package ali.serializable.demo2;

import java.io.*;

/**
 * @author laok
 * @date 2021/7/30
 */
public class ExternalizableDemo {
    public static void main(String[] args) throws IOException {
        //Write Obj to file
        User user = new User();
        user.setName("ym");
        user.setAge(19);
        try (
                OutputStream os = new FileOutputStream("src/leetcode/serializable/demo2/out");
                ObjectOutputStream oos = new ObjectOutputStream(os);
        ) {
            oos.writeObject(user);
        }

        //Read Obj from file
        try (
                InputStream is = new FileInputStream("src/leetcode/serializable/demo2/out");
                ObjectInputStream ois = new ObjectInputStream(is);
        ) {
            User user1 = (User) ois.readObject();
            System.out.println(user1.toString());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
