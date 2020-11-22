package colation.generic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class genericDemo3 {
    public static void main(String[] args) {
        Collection<Integer> list1 = new ArrayList<>();
        getElement(list1);
        Collection<String> list2 = new ArrayList<>();
        getElement(list2);
    }

    public static void getElement(Collection<?> coll) {
    }
}
