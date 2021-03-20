package lambda.demo;

import java.util.function.Supplier;

public class Jdk8Supplier {
    public static int getMax(Supplier<Integer> supplier){
         return supplier.get();
    }
    public static void main(String[] args) {
        int[] ints = {1,2,3,10};
        int max = getMax(()->{
            int temp = ints[0];
            for (int anInt : ints) {
                if (anInt == 3) break;
                temp = anInt > temp ? anInt : temp;
            }
            return temp;
        });
        System.out.println(max);
    }
}
