package ali.junit.demo2;

import mockit.NonStrictExpectations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author laok
 * @date 2021/7/31
 */
public class TestMockPrivateProperty {

    @Test
    public void testMockPrivateProperty() {
        final ClassMocked obj = new ClassMocked();
        new NonStrictExpectations(obj) {
            {
                this.setField(obj, "name", "name has bean change!");
            }
        };
        assertEquals("name has bean change!", obj.getName());
    }

    @Test
    public void testMockPrivateStaticProperty() {
        new NonStrictExpectations(ClassMocked.class) {
            {
                this.setField(ClassMocked.class, "className", "className has bean change!");
            }
        };
        assertEquals("className has bean change!", ClassMocked.getClassName());
    }


}
