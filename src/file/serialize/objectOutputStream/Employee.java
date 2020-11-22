package file.serialize.objectOutputStream;

import java.io.Serializable;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class Employee implements Serializable {
    public String name;
    public String address;
    //transient瞬态修饰成员,不会被序列化
    public transient int age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
