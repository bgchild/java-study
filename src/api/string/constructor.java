package api.string;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class constructor {
    public static void main(String[] args) {
        // 无参构造
        String str = new String();
        // 通过字符数组构造
        char chars[] = {'a', 'b', 'c'};
        String str2 = new String(chars);
        // 通过字节数组构造
        byte bytes[] = {97, 98, 99};
        String str3 = new String(bytes);
    }
}
