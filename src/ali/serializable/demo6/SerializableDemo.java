package ali.serializable.demo6;

import java.io.*;

/**
 * @author laok
 * @date 2021/7/31
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //Write Obj to file
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/leetcode/serializable/demo6/tempFile"));
        oos.writeObject(Singleton.getInstance());
        //Read Obj from file
        File file = new File("src/leetcode/serializable/demo6/tempFile");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        Singleton newInstance = (Singleton) ois.readObject();
        //判断是否是同一个对象
        System.out.println(newInstance == Singleton.getInstance());
    }
}
