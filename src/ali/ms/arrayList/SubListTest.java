package ali.ms.arrayList;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 为什么阿里巴巴要求谨慎使用ArrayList中的subList方法
 * 1. 对 父 (sourceList) 子 (subList)List 做的非结构性修改（non-structural changes），都会影响到彼此。
 * 2. 对子 List 做结构性修改，操作同样会反映到父 List 上。
 * 3. 对父 List 做结构性修改，会抛出异常 ConcurrentModificationException。
 */
public class SubListTest {
    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<String>() {{
            add("H");
            add("O");
            add("L");
            add("L");
            add("I");
            add("S");
        }};

//        List subList = sourceList.subList(2, 5);
//        sourceList.add("A");
//        System.out.println(subList);

        //如果需要对 subList 作出修改，又不想动原 list。那么可以创建 subList 的一个拷贝
        List<String> list = Lists.newArrayList(sourceList);
        long start = 2;
        long end = 5;
        final List<String> resList = list.stream().skip(start).limit(end).collect(Collectors.toList());
        System.out.println(resList);
    }
}
