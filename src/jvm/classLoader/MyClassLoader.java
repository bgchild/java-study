package jvm.classLoader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author laok
 */
public class MyClassLoader extends ClassLoader {

    private String MESSAGE_PATH = "D:\\demo\\Message.class";


    public Class<?> loadClazz(String className) {
        try {
            byte[] bytes = this.loadClassDate();
            return super.defineClass(className, bytes, 0, bytes.length);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public byte[] loadClassDate() throws Exception {
        InputStream is = new FileInputStream(MESSAGE_PATH);
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            os.write(b, 0, len);
        }
        is.close();
        os.close();
        return os.toByteArray();
    }
}
