package reflect.offer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Ann00
 * @date 2020/8/13
 */
public class ReflectDemo {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("reflect.offer.Robot");
        Robot robot = (Robot) aClass.newInstance();
        Method sayHi = aClass.getMethod("sayHi", String.class);
        sayHi.invoke(robot, "welcome");

        Field declaredField = aClass.getDeclaredField("name");
        declaredField.set(robot, "aZhen");
        sayHi.invoke(robot, "welcome");

        Method sayHello = aClass.getDeclaredMethod("sayHello", String.class);
        sayHello.setAccessible(true);
        String s = (String) sayHello.invoke(robot, "aQiang");
        System.out.println(s);
    }
}
