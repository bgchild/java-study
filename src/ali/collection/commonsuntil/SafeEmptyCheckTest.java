package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * Safe Empty Checks
 * 安全空检查
 *
 * @author laok
 * @date 2021/7/29
 */
public class SafeEmptyCheckTest {
    public static void main(String[] args) {
        List<String> list = getList();
        System.out.println("Non-Empty List Check: " + checkNotEmpty1(list));
        System.out.println("Non-Empty List Check: " + checkNotEmpty2(list));
    }

    static List<String> getList() {
        return null;
    }

    static boolean checkNotEmpty1(List<String> list) {
        return !(list == null || list.isEmpty());
    }

    static boolean checkNotEmpty2(List<String> list) {
        return CollectionUtils.isNotEmpty(list);
    }
}
