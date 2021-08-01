package ali.ssugar.demo10;

import com.google.common.collect.ImmutableList;

import java.util.List;

/**
 * foreach
 *
 * @author laok
 * @date 2021/7/31
 */
public class ForeachTest {
    public static void main(String[] args) {
        String[] ss = {"ym", "gz：dmm", "blog：www.dmm.com"};
        for (String s : ss) {
            System.out.println(s);
        }

        List<String> strList = ImmutableList.of("ym", "gz：dmm", "blog：blog：www.dmm.com");
        for (String s : strList) {
            System.out.println(s);
        }
    }
}
