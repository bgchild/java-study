package ali.ssugar.demo1;

/**
 * 糖块1
 * switch
 *
 * @author laok
 * @date 2021/7/31
 */
public class SwitchDemo {
    public static void main(String[] args) {
        String str = "hello";
        switch (str) {
            case "hello":
                System.out.println("hello");
                break;
            case "word":
                System.out.println("word");
                break;
            default:
                System.out.println("nothing");

        }
    }
}
