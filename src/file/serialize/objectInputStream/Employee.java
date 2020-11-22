package file.serialize.objectInputStream;

import java.io.Serializable;

/**
 * @author Ann00
 * @date 2020/8/21
 * 该类的序列版本号与从流中读取的类描述符的版本号不匹配
 * 该类包含未知数据类型
 * 该类没有可访问的无参数构造方法
 * Serializable 接口给需要序列化的类，提供了一个序列版本号。 serialVersionUID 该版本号的目的在于验证序列化的对象和对应类是否版本匹配
 */
public class Employee implements Serializable {
    // 加入序列版本号
    private static final long serialVersionUID = 1L;
    public String name;
    public String address;
    // 添加新的属性 ,重新编译, 可以反序列化,该属性赋为默认值.
    public int eid;

    public void addressCheck() {
        System.out.println("Address check : " + name + " ‐‐ " + address);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }
}
