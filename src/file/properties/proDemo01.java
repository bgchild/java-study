package file.properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ann00
 * @date 2020/8/20
 * 与流相关的方法
 */
public class proDemo01 {
    public static void main(String[] args) throws IOException {
        Properties pro = new Properties();
        FileInputStream fs = new FileInputStream("src/file/proprties.txt");
        pro.load(fs);
        for (String s : pro.stringPropertyNames()) {
            System.out.println(s+":"+pro.getProperty(s));
        }
    }
}
