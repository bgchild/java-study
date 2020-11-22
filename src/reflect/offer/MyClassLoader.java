package reflect.offer;

import java.io.*;

/**
 * @author Ann00
 * @date 2020/8/14
 */
public class MyClassLoader extends ClassLoader {
    private final String classLoadName;
    private final String path;

    public MyClassLoader(String path, String classLoadName) {
        this.classLoadName = classLoadName;
        this.path = path;
    }

    @Override
    protected Class<?> findClass(String name) {
        byte[] bytes = this.loadClassData(name);
        return defineClass(null,bytes,0, bytes.length);
    }


    private byte[] loadClassData(String name) {
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        File file = new File(name);

        try {
            in = new FileInputStream(file);
            out = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1) {
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                assert in != null;
                in.close();
                assert out != null;
                out.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        assert out != null;
        return out.toByteArray();
    }
}
