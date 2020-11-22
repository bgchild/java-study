package exception;

/**
 * @author Ann00
 * @date 2020/8/19
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = { 34, 12, 67 };
        int num = ArrayTools.getElement(arr, 4);
        System.out.println("num=" + num);
        System.out.println("over");
    }
}
