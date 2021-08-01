package ali.io;

import java.io.*;

/**
 * 使用bio实现文件的读写
 * @author laok
 * @date 2021/7/29
 */
public class BioTest {
    public static void main(String[] args) throws IOException {
        User1 user = new User1();
        user.setName("Ann");
        user.setAge(18);
        System.out.println(user);
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/leetCode/io/tempFile"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }

        //Read Obj from File
        File file = new File("src/leetCode/io/tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User1 newUser = (User1) ois.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            ois.close();
        }
    }
}
