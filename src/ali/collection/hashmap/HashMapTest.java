package ali.collection.hashmap;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * @author laok
 * @date 2021/7/28
 */
public class HashMapTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Map<String, String> map = new HashMap();
        Class<? extends Map> aClass = map.getClass();
        Method capacity = aClass.getDeclaredMethod("capacity");
        Method size = aClass.getDeclaredMethod("size");
        capacity.setAccessible(true);
        Object c = capacity.invoke(map);
        Object s = size.invoke(map);
        System.out.println(c);
        System.out.println(s);
    }
}
