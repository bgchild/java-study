package api.string;

/**
 * @author Ann00
 * @date 2020/8/21
 * 分割功能的方法
 */
public class SplitTest {
    public static void main(String[] args) {
        String s = "你好-大圣";
        String[] split = s.split("-");
        for (String s1 : split) {
            System.out.println(s1);
        }
    }
}
