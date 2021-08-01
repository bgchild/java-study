package functional.optional;


import java.util.Optional;
import java.util.function.Supplier;

class Student {
    public Student() {
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name:" + name + "  age:" + age;
    }
}

/**
 * Optional 容器类：用于尽量避免空指针异常
 * Optional.of(T t) : 创建一个 Optinal 实例
 * Optional.empty() : 创建一个空的 Optional 实例
 * Optional.ofNullable(T t):若 t 不为 null,创建 Optional 实例,否则创建空实例
 * isPresent() : 判断是否包含值
 * orElse(T t) :  如果调用对象包含值，返回该值，否则返回t
 * orElseGet(Supplier s) :如果调用对象包含值，返回该值，否则返回 s 获取的值
 * map(Function f): 如果有值对其处理，并返回处理后的Optional，否则返回 Optional.empty()
 * flatMap(Function mapper):与 map 类似，要求返回值必须是Optional
 *
 * @author laok
 */
public class OptionalTest {
    public static void main(String[] args) {
        final Optional<Student> ym = Optional.of(new Student("杨幂", null));
        final Optional<String> s = ym.map(Student::getAge);
        System.out.println("age：" + s);
        final Optional<String> name = ym.flatMap(student -> Optional.of(student.getName()));
        System.out.println("name:" + name.get());
        //Optional.ofNullable(T t):若 t 不为 null,创建 Optional 实例,否则创建空实例
        final Optional<Student> student = Optional.ofNullable(null);
        if (student.isPresent()) {
            System.out.println(student.get());
        } else {
            System.out.println(student.isPresent());
        }
        //orElse(T t) :  如果调用对象包含值，返回该值，否则返回t
        final Student mm = student.orElse(new Student("杨幂", "19"));
        System.out.println(mm);

        //orElseGet(Supplier s) :如果调用对象包含值，返回该值，否则返回 s 获取的值
        final Student rb = student.orElseGet(new Supplier<Student>() {
            @Override
            public Student get() {
                return new Student("乐吧", "18");
            }
        });
        System.out.println(rb);

        final Optional<Student> student2 = Optional.of(new Student());
        System.out.println(student2.get());

        final Student yz = null;
        final Student student3 = Optional.ofNullable(yz).orElse(new Student("燕姿", "22"));
        System.out.println(student3);
    }
}
