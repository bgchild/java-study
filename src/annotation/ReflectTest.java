package annotation;

import java.lang.reflect.Method;

/**
 * 框架类
 *
 * @author laok
 */


@Pro(className = "annotation.AnnoDemo1", methodName = "add")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        //2.调用注解对象中定义的抽象方法，获取返回值
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);
        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName, int.class, int.class);
        //6.执行方法
        final Object invoke = method.invoke(obj, 1, 2);
        System.out.println(invoke);
    }
}
