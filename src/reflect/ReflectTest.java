package reflect;

import reflect.demo.domain.Person;

import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 关于反射
 *
 * @author laok
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        /**
         获取Class对象的方式：
         1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
         2. 类名.class：通过类名的属性class获取
         3. 对象.getClass()：getClass()方法在Object类中定义着。
         */
        final Class<?> cls1 = Class.forName("reflect.demo.domain.Person");
        System.out.println(cls1);

        final Class<Person> cls2 = Person.class;
        System.out.println(cls2);

        final Person person1 = new Person();
        final Class<? extends Person> cls3 = person1.getClass();
        System.out.println(cls3);

        //== 比较三个对象
        System.out.println(cls1 == cls2);
        System.out.println(cls1 == cls2);
        System.out.println(cls2 == cls3);

        /**
         获取成员变量们
         * Field[] getFields()  获取所有public修饰的成员变量
         * Field getField(String name)
         * Field[] getDeclaredFields()  reflecting all the fields
         * Field getDeclaredField(String name)
         */
        final Person person = cls2.newInstance();
        final Field[] fields = cls2.getFields();
        for (Field field : fields) {
            System.out.println("fields:" + field);
        }
        final Field[] declaredFields = cls2.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("declaredFields:" + declaredField);
        }
        final Field declaredField = cls2.getDeclaredField("d");
        //暴力反射
        declaredField.setAccessible(true);
        declaredField.set(person, "大秘密");
        final Object d = declaredField.get(person);
        System.out.println(d);

        /**
         获取构造方法们
         * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(类<?>... parameterTypes)
         * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
         */
        final Constructor<?>[] constructors = cls2.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("constructor:" + constructor);
        }
        //获取所有构造方法
        final Constructor<?>[] declaredConstructors = cls2.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("declaredConstructors：" + declaredConstructor);
        }
        final Constructor<Person> constructor = cls2.getConstructor(String.class, int.class);
        System.out.println("constructor：" + constructor);

        //实例化对象
        final Person ym = constructor.newInstance("杨幂", 18);
        System.out.println(ym.getName());

        /**
         3. 获取成员方法们：
         * Method[] getMethods()
         * Method getMethod(String name, 类<?>... parameterTypes)
         * Method[] getDeclaredMethods()
         * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */
        final Method[] declaredMethods = cls2.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("declaredMethods:" + declaredMethod);
        }
        final Method setAge = cls2.getMethod("setAge", int.class);
        System.out.println("method:" + setAge);
        setAge.invoke(person, 18);
        System.out.println(person.getAge());

        /**
         *1.加载配置文件
         *1.1创建Properties对象
         *1.2加载配置文件，转换为一个集合
         *1.2.1获取class目录下的配置文件
         *2.获取配置文件中定义的数据
         *3.加载该类进内存
         *4.创建对象
         *5.获取方法对象
         *6.执行方法
         */
        Properties pro = new Properties();
        final ClassLoader classLoader = ReflectTest.class.getClassLoader();
        final InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);
        final String className = pro.getProperty("className");
        final String methodName = pro.getProperty("methodName");
        final Class<?> aClass = Class.forName(className);
        final Method method = aClass.getMethod(methodName);
        final Object o = aClass.newInstance();
        final Object invoke = method.invoke(o);
        System.out.println(invoke);
    }
}

