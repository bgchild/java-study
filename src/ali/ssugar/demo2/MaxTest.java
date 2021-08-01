package ali.ssugar.demo2;

import java.util.Collection;
import java.util.Iterator;

/**
 * 泛型
 *
 * @author laok
 * @date 2021/7/31
 */
public class MaxTest {
    public static <A extends Comparable<A>> A max(Collection<A> xs) {
        Iterator<A> xi = xs.iterator();
        A w = xi.next();
        while (xi.hasNext()) {
            A x = xi.next();
            if (w.compareTo(x) < 0)
                w = x;
        }
        return w;
    }
}
