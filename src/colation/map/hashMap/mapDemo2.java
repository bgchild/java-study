package colation.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class mapDemo2 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("黄晓明","杨颖");
        hm.put("文章","马伊琍");
        hm.put("邓超","孙俪");
        Set<Map.Entry<String, String>> entries = hm.entrySet();
        for (Map.Entry<String,String> item: entries) {
            String key = item.getKey();
            String value = item.getValue();
            System.out.println(key+"=="+value);
        }
    }
}
