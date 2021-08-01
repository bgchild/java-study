package ali.keyword;

/**
 * volatile
 * 单例
 *
 * @author laok
 * @date 2021/8/1
 */
public class Volatile {
    private volatile static Volatile aVolatile;

    public static Volatile getInstance() {
        if (aVolatile == null) {
            synchronized (Volatile.class) {
                if (aVolatile == null) {
                    aVolatile = new Volatile();
                }
            }
        }
        return aVolatile;
    }
}
