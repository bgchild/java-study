package ali.annotation.demo1;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author laok
 * @date 2021/7/31
 */
public class MyTest {
    public static void main(String[] args) throws Exception {
        //初始化全都赋值无注解
        Person person = new Person("无注解", "无注解", "无注解");
        //解析注解
        doAnnoTest(person);
        System.out.println(person.toString());
    }

    private static void doAnnoTest(Person person) throws Exception {
        Class clazz = person.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(MyAnno.class)) {
                MyAnno anno = field.getAnnotation(MyAnno.class);
                if (anno != null) {
                    final String fieldName = field.getName();
                    System.out.println(fieldName);
                    Method setMethod = clazz.getDeclaredMethod("set" + fieldName.substring(0, 1).toUpperCase() + fieldName.substring(1), String.class);

                    //获取注解的属性
                    String annoValue = anno.value();
                    System.out.println(annoValue);
                    //将注解的属性值赋给对应的属性
                    setMethod.invoke(person, annoValue);
                }
            }
        }
    }
}
