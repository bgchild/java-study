package exception;

/**
 * 自定义RegisterException
 * @author Ann00
 * @date 2020/8/19
 */
public class RegisterException extends Exception{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
