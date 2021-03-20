package lambda.demo;

import oop.interfacekey.demo5.D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Jdk8StremFlatMapAndMap {
    // 自增生成组编号
    static int group = 1;
    // 自增生成学生编号
    static int student = 1;

    public static void main(String[] args) {

        List<String[]> eggs = new ArrayList<>();
        // 第一箱鸡蛋
        eggs.add(new String[]{"鸡蛋_1", "鸡蛋_1", "鸡蛋_1", "鸡蛋_1", "鸡蛋_1"});
        // 第二箱鸡蛋
        eggs.add(new String[]{"鸡蛋_2", "鸡蛋_2", "鸡蛋_2", "鸡蛋_2", "鸡蛋_2"});
        for (String[] egg : eggs) {
            System.out.println(Arrays.toString(egg));
        }
        //map
        eggs.stream().map(new Function<String[], Stream<String>>() {
            @Override
            public Stream<String> apply(String[] strings) {
                return Arrays.stream(strings).map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.replace("鸡", "煎");
                    }
                });
            }
        }).forEach(new Consumer<Stream<String>>() {
            @Override
            public void accept(Stream<String> stringStream) {
                System.out.println("组" + group++ + ":" + Arrays.toString(stringStream.toArray()));
            }
        });

        //flatMap
        eggs.stream().flatMap(new Function<String[], Stream<String>>() {
            @Override
            public Stream<String> apply(String[] strings) {
                return Arrays.stream(strings).map(new Function<String, String>() {
                    @Override
                    public String apply(String s) {
                        return s.replace("鸡", "炒");
                    }
                });
            }
        }).forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("学生" + student++ +":" + s);
            }
        });
    }
}
