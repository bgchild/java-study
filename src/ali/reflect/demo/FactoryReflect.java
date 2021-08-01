package ali.reflect.demo;

/**
 * @author laok
 * @date 2021/7/29
 */
public class FactoryReflect {
    public static Fruit getInstance(String className) throws Exception {
        Class<?> aClass = Class.forName(className);
        Fruit o = (Fruit) aClass.newInstance();
        return o;
    }
}
