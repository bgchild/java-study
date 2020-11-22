package lambda.calculator;

/**
 * @author Ann00
 */
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };
        //使用匿名内部类
        invokeCalc(10,20, calculator);
        //使用lambda表达式
        invokeCalc(10,20, (int a, int b)->{return a + b;});
        //简化lambda表达式
        invokeCalc(10,20, ( a,  b) -> a + b);

    }

    public static void invokeCalc(int a, int b, Calculator calculator) {
        int num = calculator.calc(a, b);
        System.out.println(num);
    }
}
