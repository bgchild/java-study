package oop.domain;

public class Person {
    private final String name;
    private static final int age = 1;

    public Person(String name) {
        this.name = name;
    }

    public class Student {
        private String studentDesc;

        public void test() {
            System.out.println(name);
            System.out.println(age);
            System.out.println(Teacher.teacherDesc);
        }
    }

    public static class Teacher {
        private static String teacherDesc;
        public void test() {
            final Person person = new Person("阿珍");
            System.out.println(age);
            System.out.println(person.name);

        }
    }

    public static void main(String[] args) {
        Student student = new Person("阿强").new Student();
        student.test();
        final Teacher teacher = new Teacher();
        teacher.test();
    }

}
