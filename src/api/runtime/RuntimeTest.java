package api.runtime;

public class RuntimeTest {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

        System.out.println("【1】" + Runtime.getRuntime().maxMemory());
        System.out.println("【1】" + Runtime.getRuntime().totalMemory());
        System.out.println("【1】" + Runtime.getRuntime().freeMemory());

        Runtime.getRuntime().gc();

        System.out.println("【2】" + Runtime.getRuntime().maxMemory());
        System.out.println("【2】" + Runtime.getRuntime().totalMemory());
        System.out.println("【2】" + Runtime.getRuntime().freeMemory());
    }
}
