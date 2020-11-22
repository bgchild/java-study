package reflect.offer;

/**
 * @author Ann00
 * @date 2020/8/13
 */
public class Robot {
    public String name;

    public void sayHi(String hello) {
        System.out.println(hello+" "+ name);
    }

    private String sayHello(String tag) {
        return "Hello " + tag;
    }

}
