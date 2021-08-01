package ali.serializable.demo4;

import java.io.*;
import java.util.Date;

/**
 * transient关键字
 * @author laok
 * @date 2021/7/31
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException {
        //Initializes The Object
        User user = new User();
        user.setName("ym");
        user.setGender("male");
        user.setAge(23);
        user.setBirthday(new Date());
        System.out.println(user);
        //Write Obj to File
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("src/leetcode/serializable/demo4/tempFile"));
            oos.writeObject(user);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
        }
        //Read Obj from File
        File file = new File("src/leetcode/serializable/demo4/tempFile");
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(file));
            User newUser = (User) ois.readObject();
            System.out.println(newUser);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
