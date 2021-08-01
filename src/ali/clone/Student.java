package ali.clone;

public class Student implements Cloneable {
    //引用类型
    private Subject subject;
    //基础数据类型
    private String name;
    private int age;

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

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

//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }

    @Override
    public String toString() {
        return "[Student: " + this.hashCode() + ",subject:" + subject + ",name:" + name + ",age:" + age + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student =  (Student) super.clone();
        student.subject = (Subject) subject.clone();
        return student;
    }
}
