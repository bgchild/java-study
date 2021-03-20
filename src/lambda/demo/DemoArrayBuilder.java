package lambda.demo;

public class DemoArrayBuilder {
    private static int[] initArray(int length, ArrayBuilder builder) {
        return builder.buildArray(length);
    }

    public static void main(String[] args) {
        int[] array = initArray(10, int[]::new);
        System.out.println(array.length);
    }
}
