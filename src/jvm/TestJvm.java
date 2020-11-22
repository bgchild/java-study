package jvm;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class TestJvm {
    public static void main(String[] args) {
        String str = System.getProperty("str");
        if (str == null) {
            System.out.println("itcast");
        } else {
            System.out.println(str);
        }
    }
}
