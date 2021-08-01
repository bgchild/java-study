package collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person implements Comparable<Person> {
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + this.name + ",age:" + this.age;
    }

    @Override
    public int compareTo(Person o) {
        int a = this.age - o.getAge();
        if (a != 0) {
            return a;
        } else {
            System.out.println(o.getName().compareTo(this.name));
            return o.getName().compareTo(this.name);
        }
    }
}

/**
 * Comparable
 * @author laok
 */
public class ComparableTest {
    public static void main(String[] args) {
        Person mm = new Person("大幂幂", 18);
        Person rb = new Person("热巴", 17);
        Person xy = new Person("小颖", 18);
        List<Person> list = new ArrayList<>();
        list.add(mm);
        list.add(rb);
        list.add(xy);
        Collections.sort(list);
        list.stream().forEach(person -> System.out.println(person.toString()));
    }
}
