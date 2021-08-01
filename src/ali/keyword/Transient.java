package ali.keyword;

/**
 * Transient 关键字
 * 在序列化的时候其值会被忽略，在被反
 * 序列化后， transient 变量的值被设为初始值， 如 int 型的是 0，对象型的是 null。
 * @author laok
 * @date 2021/8/1
 */
public class Transient {
    private transient int age;
    private String name;
}
