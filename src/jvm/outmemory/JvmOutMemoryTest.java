package jvm.outmemory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author Ann00
 * @date 2020/8/22
 */
public class JvmOutMemoryTest {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        for (int i = 0; i < 1000000000; i++) {
            String str = "";
            for (int j = 0; j < 1000000000; j++) {
                str += UUID.randomUUID().toString();
            }
            list.add(str);
        }
        System.out.println("ok");
    }
}
