package ali.serializable.demo5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList序列化
 *
 * @author laok
 * @date 2021/7/31
 */
public class SerializableDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<String> list = new ArrayList<>();
        list.add("ym");
        list.add("rb");
        list.add("cqe");
        System.out.println("init list" + list);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("src/leetcode/serializable/demo5/tempFile"));
        objectOutputStream.writeObject(list);
        objectOutputStream.close();
        File file = new File("src/leetcode/serializable/demo5/tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        List<String> newStringList = (List<String>) objectInputStream.readObject();
        objectInputStream.close();
        if (file.exists()) {
            file.delete();
        }
        System.out.println("new list" + newStringList);
    }
}
