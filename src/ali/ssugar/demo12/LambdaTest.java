package ali.ssugar.demo12;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * @author laok
 * @date 2021/8/1
 */
public class LambdaTest {
    public static void main(String[] args) {
        List<String> strList = ImmutableList.of("ym", "gz：dmm", "blog：www.dmm.com");
        strList.forEach(s -> {
            System.out.println(s);
        });
    }
}
