package file.properties;

/**
 * @author Ann00
 * @date 2020/8/20
 * 构造方法
 */

import java.util.Properties;
import java.util.Set;

/**
 * public Object setProperty(String key, String value) ： 保存一对属性。
 * public String getProperty(String key) ：使用此属性列表中指定的键搜索属性值。
 * public Set<String> stringPropertyNames() ：所有键的名称的集合。
 */
public class proDemo {
    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("a","笑傲江湖");
        properties.setProperty("b","天龙八部");
        properties.setProperty("c","神雕侠侣");
        System.out.println(properties);
        System.out.println(properties.getProperty("a"));
        Set<String> strings = properties.stringPropertyNames();
        for (String string : strings) {
            System.out.println(string);
        }

    }
}
