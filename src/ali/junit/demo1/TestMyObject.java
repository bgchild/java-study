package ali.junit.demo1;


import mockit.Mocked;
import mockit.NonStrictExpectations;
import mockit.Verifications;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author laok
 */
public class TestMyObject {
    //用@Mocked 标注的对象，不需要赋值，jmockit 自动 mock
    @Mocked
    MyObject obj;

    @Test
    public void testHello() {
        //录制预期模拟行为
        new NonStrictExpectations(obj) {
            {
                obj.sayHello("ZhangSan");
                returns("Hello ZhangSan");
                //也可以使用：result = "Hello ZhangSan";
            }
        };
        //调用测试方法
        assertEquals("Hello ZhangSan", obj.sayHello("ZhangSan"));
        //验证预期 Mock 行为被调用
        new Verifications() {
            {
                obj.sayHello("ZhangSan");
                times = 1;
            }
        };
    }

    @Test
    public void testHello2() {
        final MyObject obj = new MyObject();
        //录制预期模拟行为
        new NonStrictExpectations(obj) {
            {
                obj.sayHello("ZhangSan");
                returns("Hello ZhangSan");
                //也可以使用：result = "Hello ZhangSan";
            }
        };
        //调用测试方法
        assertEquals("Hello ZhangSan", obj.sayHello("ZhangSan"));
        new Verifications() {//验证预期 Mock 行为被调用
            {
                obj.sayHello("ZhangSan");
                times = 1;
            }
        };
    }

    @Test
    public void testMockStaticMethod() {
        new NonStrictExpectations(ClassMocked.class) {
            {
                //也可以使用参数匹配：ClassMocked.getDouble(anyDouble);
                ClassMocked.getDouble(1);
                result = 3;
            }
        };
        assertEquals(3, ClassMocked.getDouble(1));

        new Verifications() {
            {
                ClassMocked.getDouble(1);
                times = 1;
            }
        };
    }

    @Test
    public void testMockPrivateMethod() {
        final ClassMocked obj = new ClassMocked();
        new NonStrictExpectations(obj) {
            {
                //如果私有方法是静态的，可以使用：this.invoke(null, "multiply3");
                this.invoke(obj, "multiply3", 1);
                result = "4";
            }
        };
        String actual = obj.getTripleString(1);
        assertEquals("4", actual);
        new Verifications() {
            {
                this.invoke(obj, "multiply3", 1);
                times = 1;
            }
        };
    }
}
