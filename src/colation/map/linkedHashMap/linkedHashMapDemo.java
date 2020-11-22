package colation.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class linkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, String> lk = new LinkedHashMap<>();
        lk.put("黄晓明","杨颖");
        lk.put("文章","马伊琍");
        lk.put("邓超","孙俪");
        Set<Map.Entry<String, String>> entries = lk.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }

    }
}
