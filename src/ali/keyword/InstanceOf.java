package ali.keyword;

import java.util.Vector;

/**
 * @author laok
 * @date 2021/8/1
 */
public class InstanceOf {
    public static void main(String[] args) {
        Object o = new Object();
        if (o instanceof Vector) {
            System.out.println("对象是 java.util.Vector 类的实例");
        } else {
            System.out.println("对象是 " + o.getClass() + " 类的实例");
        }

        //int i = 0;
        //System.out.println(i instanceof Integer);//编译不通过i必须是引用类型，不能是基本类型
        //System.out.println(i instanceof Object);//编译不通过
        Integer in = new Integer(1);
        System.out.println(in instanceof Integer);//true
        //false,在JavaSE规范中对instanceof运算符的规定就是：如果obj为null，那么将返回false。
        System.out.println(null instanceof Object);
    }


}
