package ali.collection.commonsuntil;

import org.apache.commons.collections4.CollectionUtils;

import java.util.LinkedList;
import java.util.List;

/**
 * IgnoreNull
 *
 * @author laok
 * @date 2021/7/29
 */
public class IgnoreNullTest {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        CollectionUtils.addIgnoreNull(list, null);
        CollectionUtils.addIgnoreNull(list, "a");
        System.out.println(list);
        if (list.contains(null)) {
            System.out.println("Null value is present");
        } else {
            System.out.println("Null value is not present");
        }
    }
}
