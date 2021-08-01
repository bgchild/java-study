package file.digui;

public class Test01 {
    public static void main(String[] args) {
//        a();
        b(1);
    }

    /**
     * 1.递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。 Exception in thread "main"
     * java.lang.StackOverflowError
     */
    public static void a() {
        System.out.println("调用a方法！");
        a();
    }

    public static void b(int num){
        if (num == 5000) {
            return;
        }
        System.out.println(num++);
        b(num);
    }
}
