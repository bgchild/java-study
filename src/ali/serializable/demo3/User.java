package ali.serializable.demo3;

import java.io.Serializable;

/**
 * @author laok
 * @date 2021/7/30
 */
public class User implements Serializable {

    private static final long serialVersionUID = 927524039536634240L;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
