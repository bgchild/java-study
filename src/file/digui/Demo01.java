package file.digui;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class Demo01 {
    public static void main(String[] args) {
        // a();
        b(1);
    }
    public static void b(int num){
        if (num == 5000){
            return;
        }
        System.out.println(num);
        num++;
        b(num);
    }

    /*
     * 1.递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。 Exception in thread "main"
     * java.lang.StackOverflowError
     */
    private static void a() {
        System.out.println("a方法");
        a();
    }

}
