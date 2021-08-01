package ali.generics.demo4;

import java.util.List;

/**
 * 泛型的重载问题
 *
 * @author laok
 * @date 2021/7/30
 */
public class OverrideTest {
    //both methods have same erasure
//    public void method(List<String> list) {
//        System.out.println("invoke List<String>");
//    }

    public void method(List<Integer> list) {
        System.out.println("invoke List<Integer>");
    }
}
