package colation.map.hashMap;

import colation.map.demo.Student;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ann00
 * @date 2020/8/18
 * key唯一，无序
 */
public class hashMapDemo {
    public static void main(String[] args) {

        Map<Student,String> map = new HashMap<Student,String>();

        map.put(new Student("lisi",28), "上海");
        map.put(new Student("wangwu",22), "北京");
        map.put(new Student("zhaoliu",24), "成都");
        map.put(new Student("zhouqi",25), "广州");
        map.put(new Student("wangwu",22), "南京");
        for (Student student : map.keySet()) {
            String value = map.get(student);
            System.out.println(student.toString()+"....."+value);
        }
    }
}
