package ali.clone;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        //浅拷贝
//        Subject subject = new Subject("yuwen");
//        Student studentA = new Student();
//        studentA.setSubject(subject);
//        studentA.setName("Lynn");
//        studentA.setAge(20);
//        Student studentB = (Student) studentA.clone();
//        studentB.setName("Lily");
//        studentB.setAge(18);
//        Subject subjectB = studentB.getSubject();
//        //subjectB.setName("lishi");
//        System.out.println("studentA:" + studentA.toString());
//        System.out.println("studentB:" + studentB.toString());


        //对象拷贝
//        Subject subject = new Subject("yuwen");
//        Student studentA = new Student();
//        studentA.setSubject(subject);
//        studentA.setName("Lynn");
//        studentA.setAge(20);
//        Student studentB = studentA;
//        studentB.setName("Lily");
//        studentB.setAge(18);
//        Subject subjectB = studentB.getSubject();
//        subjectB.setName("lishi");
//        System.out.println("studentA:" + studentA.toString());
//        System.out.println("studentB:" + studentB.toString());


        //深拷贝
        Subject subject = new Subject("yuwen");
        Student studentA = new Student();
        studentA.setSubject(subject);
        studentA.setName("Lynn");
        studentA.setAge(20);
        Student studentB = (Student) studentA.clone();
        studentB.setName("Lily");
        studentB.setAge(18);
        studentB.getSubject().setName("lishi");
        System.out.println("studentA:" + studentA.toString());
        System.out.println("studentB:" + studentB.toString());
    }
}
