package ali.generics.demo6;

import java.util.ArrayList;
import java.util.List;

/**
 * @author laok
 * @date 2021/7/30
 */
public class Test {
    public static void main(String[] args) {
        List<Object> listObj = new ArrayList<>();
        List<String> listStr = new ArrayList<>();
//        listObj = listStr;
        List<?> list = new ArrayList<>();
        list = listObj;
        list = listStr;
    }
}
