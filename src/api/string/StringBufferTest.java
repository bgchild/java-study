package api.string;

/**
 * StringBuffer
 * 使用和StringBuilder区别 StringBuffer是同步线程安全的效率没有StringBuilder高
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer res = new StringBuffer();
        for (int i = 'a'; i <= 'z'; i++) {
            res.append((char) (i));
        }
        res = res.reverse();
        res.delete(0, 5);
        System.out.println(res);
    }
}
