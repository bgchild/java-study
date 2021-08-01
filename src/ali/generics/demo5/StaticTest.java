package ali.generics.demo5;

/**
 * @author laok
 * @date 2021/7/30
 */
public class StaticTest {
    public static void main(String[] args) {
        GT<String> gts = new GT();
        gts.var = 1;
        GT<Integer> gti = new GT();
        gti.var = 2;
        System.out.println(gts.var);
    }
}

class GT<T> {
    public static int var = 0;

    public void nothing(T x) {
    }
}
