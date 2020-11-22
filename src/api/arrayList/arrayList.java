package api.arrayList;

/**
 * @author Ann00
 * @date 2020/8/21
 * 查看类
 * java.util.ArrayList <E> ：该类需要 import导入使后使用。
 * <E> ，表示一种指定的数据类型，叫做泛型。 E ，取自Element（元素）的首字母。在出现 E 的地方，我们使
 * 用一种引用数据类型将其替换即可，表示我们将存储哪种引用类型的元素。代码如下：
 * 查看构造方法
 * public ArrayList() ：构造一个内容为空的集合。
 * 基本格式:
 * 在JDK 7后,右侧泛型的尖括号之内可以留空，但是<>仍然要写。简化格式：
 * 查看成员方法
 * public boolean add(E e) ： 将指定的元素添加到此集合的尾部。
 * 参数 E e ，在构造ArrayList对象时， <E> 指定了什么数据类型，那么 add(E e) 方法中，只能添加什么数据
 * 类型的对象。
 * 使用ArrayList类，存储三个字符串元素，代码如下：
 * ArrayList<String>，ArrayList<Student>
 * ArrayList<String> list = new ArrayList<String>();
 * ArrayList<String> list = new ArrayList<>();
 */
public class arrayList {
}
