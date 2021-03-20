package lambda.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Jdk8Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");
//        list.stream().filter(s -> {
//            System.out.println(s);
//            return s.equals("张强");
//        }).findAny();
        list.stream().anyMatch(s -> {
            System.out.println(s);
            return s.equals("张强");
        });

//        try {
//            list.stream().forEach(new Consumer<String>() {
//                @Override
//                public void accept(String s) {
//                    if (s.equals("赵敏")) {
//                        throw new RuntimeException();
//                    }
//                    System.out.println(s);
//                }
//            });
//        }catch (Exception e){
//
//        }

        // list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(s -> System.out.println(s));
//        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).flatMap(new Function<String, Stream<?>>() {
//            @Override
//            public Stream<String> apply(String s) {
//                List<String> list = new ArrayList<>();
//                list.add("1");
//                list.add("2");
//                list.add("3");
//                return list.stream();
//            }
//        }).forEach(s -> System.out.println(s));
    }
}
