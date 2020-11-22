package api.objects.equals;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("aaa");
        System.out.println(Objects.equals(s1, s2));
    }
}
