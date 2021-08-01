package ali.junit.demo3;

import mockit.Mock;
import mockit.MockUp;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * @author laok
 * @date 2021/7/31
 */
public class TestStateMocked {
    @Test
    public void testMockNormalMethodContent() throws IOException {
        StateMocked obj = new StateMocked();
        //使用 MockUp 修改被测试方法内部逻辑
        MockUp<StateMocked> mockUp = new MockUp<StateMocked>() {
            @Mock
            public int getTriple(int i) {
                return i * 30;
            }
        };
        assertEquals(30, obj.getTriple(1));
        assertEquals(60, obj.getTriple(2));

        mockUp.tearDown();//注意：在 JMockit1.5 之后已经没有 Mockit 这个类，使用 MockUp 代替，mockUp 和 tearDown 方法在 MockUp 类中
    }


    @Test
    public void testGetTriple() {
        new MockUp<StateMocked>() {
            @Mock
            public int getDouble(int i){
                return i*20;
            }
        };
        assertEquals(20, StateMocked.getDouble(1));
        assertEquals(40, StateMocked.getDouble(2));
    }
}
