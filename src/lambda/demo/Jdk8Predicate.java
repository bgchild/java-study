package lambda.demo;

import java.util.function.Predicate;

public class Jdk8Predicate {
    //抽象方法：test
    public static void methond(Predicate<String> predicate) {
        boolean veryLong = predicate.test("HelloWorld");
        System.out.println("字符串长吗： " + veryLong);
    }
    //默认方法：and
    public static void methondAnd(Predicate<String> one,Predicate<String> two) {
        boolean isValid = one.and(two).test("HelloWorld");
        System.out.println("字符串符合要求吗：" + isValid);
    }
    //默认方法：or
    public static void methondOr(Predicate<String> one,Predicate<String> two) {
        boolean isValid = one.or(two).test("HelloWorld");
        System.out.println("字符串符合要求吗：" + isValid);
    }
    //默认方法：negate 取反
    public static void methondNegate(Predicate<String> one) {
        boolean isValid = one.negate().test("HelloWorld");
        System.out.println("字符串符合要求吗：" + isValid);
    }

    public static void main(String[] args) {
        methond(s -> s.length() > 5);
        methondAnd(s -> s.contains("H"),s -> s.contains("W"));
        methondOr(s -> s.contains("H"),s -> s.contains("K"));
        methondNegate(s -> s.contains("s"));
        Predicate<String> predicate = item -> "HelloWorld".equals(item);
        Predicate.isEqual("HelloWorld");
    }
}
