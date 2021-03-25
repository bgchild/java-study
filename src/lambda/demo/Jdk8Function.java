package lambda.demo;

import java.util.function.Function;

public class Jdk8Function {
    public static void methond(Function<String, Integer> function) {
        int num = function.apply("10");
        System.out.println(num + 20);
    }

    public static void methodAndThen(Function<String, Integer> one, Function<Integer, Integer> two) {
        int num = one.andThen(two).apply("10");
        System.out.println(num + 20);
    }

    //请使用 Function 进行函数模型的拼接，按照顺序需要执行的多个函数操作为：
    //String str = "赵丽颖,20";
    //1. 将字符串截取数字年龄部分，得到字符串；
    //2. 将上一步的字符串转换成为int类型的数字；
    //3. 将上一步的int数字累加100，得到结果int数字。
    public static Integer demo(Function<String, String> one, Function<String, Integer> two, Function<Integer, Integer> three) {
        return one.andThen(two).andThen(three).apply("赵丽颖,20");
    }

    public static void main(String[] args) {
        methond(s -> Integer.parseInt(s));
        methodAndThen(s -> Integer.parseInt(s) + 10, s -> s *= 10);
        Integer demo = demo(
                s -> s.split(",")[1],
                s -> Integer.parseInt(s),
                s -> s + 100
        );

        System.out.println(demo);
    }
}
