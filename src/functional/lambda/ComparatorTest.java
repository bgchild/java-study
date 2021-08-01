package functional.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Ann00
 */
public class ComparatorTest {
    public static void main(String[] args) {
        Person[] arr = {
                new Person("柳岩", 30),
                new Person("迪丽热巴", 20),
                new Person("刘亦菲", 25)
        };
        //使用匿名内部类
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.age - o1.age;
            }
        });
        //使用lambda表达式
        Arrays.sort(arr, (Person o1, Person o2)->{ return o2.age - o1.age;});

        //简化lambda表达式
        Arrays.sort(arr, (o1, o2)-> o2.age - o1.age);

        for (Person a : arr) {
            System.out.println(a);
        }
    }
}

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{name=" + name + ",age=" + age + "}";
    }
}
