package colation.map.hashMap;

import java.util.HashMap;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class
mapDemo1 {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("黄晓明","杨颖");
        hm.put("文章","马伊琍");
        hm.put("邓超","孙俪");
        for (String s : hm.keySet()) {
            System.out.println(s+"的CP是："+hm.get(s));
        }
    }
}
