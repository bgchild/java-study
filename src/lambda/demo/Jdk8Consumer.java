package lambda.demo;

import java.util.function.Consumer;

public class Jdk8Consumer {
    private static void consumeString(Consumer<String> one, Consumer<String> two) {
        one.andThen(two).accept("Hello");
    }

    public static void main(String[] args) {
        consumeString(
                s -> System.out.println(s.toLowerCase()),
                s -> System.out.println(s.toUpperCase())
        );
    }
}
