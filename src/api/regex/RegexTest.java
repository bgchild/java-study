package api.regex;

/**
 * 正则验证
 */
public class RegexTest {
    public static void main(String[] args) {
        final boolean email = Validate.isEmail("www@qq.com");
        System.out.println(email);
    }
}

class Validate {

    public static boolean isEmail(String email) {
        if (email == null || email == "") {
            return false;
        } else {

            String reg = "\\w+@\\w+\\.\\w+";
            if (email.matches(reg)) {
                return true;
            } else {
                return false;
            }
        }

    }
}
