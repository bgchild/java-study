package api.objects;

import java.util.Objects;

public class EqualsTest {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = new String("aaa");
        System.out.println(Objects.equals(s1, s2));
    }
}
