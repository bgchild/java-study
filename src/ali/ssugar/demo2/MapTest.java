package ali.ssugar.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * 糖块2
 * 泛型
 * @author laok
 * @date 2021/7/31
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap();
        map.put("name", "ym");
        map.put("wechat", "dmm");
        map.put("blog", "www.dmm.com");
    }
}
