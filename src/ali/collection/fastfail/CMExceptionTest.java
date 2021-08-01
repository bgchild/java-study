package ali.collection.fastfail;

import java.util.ArrayList;
import java.util.List;

/**
 * 如果在 foreach 循环里对某些集合元素进行元素的 remove/add 操作
 * 的时候，就会触发 fail-fast 机制，进而抛出 CMException
 * @author laok
 * @date 2021/7/29
 */
public class CMExceptionTest {
    public static void main(String[] args) {
        List<String> userNames = new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
            add("D");
        }};
        for (String userName : userNames) {
            if (userName.equals("D")) {
                userNames.remove(userName);
            }
        }
        System.out.println(userNames);
    }
}
