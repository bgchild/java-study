package ali.ms.transmit;

/**
 * @author laok
 * @date 2021/7/26
 */
public class Test {
    public static void main(String[] args) {
        final Person person = new Person();
        person.setName("An");
        person.setAge(18);
        pass(person);
        System.out.println("main:" + person.toString());
    }

    public static void pass(Person person) {
        person = new Person();
        person.setAge(19);
        System.out.println("pass:" + person.toString());
    }
}
