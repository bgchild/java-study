package ali.reflect.demo;

/**
 * @author laok
 * @date 2021/7/29
 */
public class Factory {
    public static Fruit getInstance(String fruitName) {
        Fruit f = null;
        if ("Apple".equals(fruitName)) {
            f = new Apple();
        }
        if ("Orange".equals(fruitName)) {
            f = new Orange();
        }
        return f;
    }
}
