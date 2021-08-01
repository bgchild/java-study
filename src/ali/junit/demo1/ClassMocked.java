package ali.junit.demo1;

/**
 * @author laok
 * @date 2021/7/31
 */
public class ClassMocked {
    public static int getDouble(int i) {
        return i + 2;
    }

    public String getTripleString(int i) {
        return String.valueOf(i + 3);
    }

    private String multiply3(int i) {
        return String.valueOf(i + 3);
    }
}
