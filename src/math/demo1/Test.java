package math.demo1;

import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        int n = 1162261467;
        boolean b = Pattern.compile("^10*$").matcher(Integer.toString(n, 3)).find();
        System.out.println(b);
    }
}
