package reflect.offer;

/**
 * @author Ann00
 * @date 2020/8/14
 */
public class ClassLoaderChecker {
    public static void main(String[] args) throws Exception {
        MyClassLoader mc = new MyClassLoader("D://demo/", "myClassLoad");
        Class<?> wali = mc.findClass("Wali");
        System.out.println(wali.getClassLoader());
        wali.newInstance();
    }
}
