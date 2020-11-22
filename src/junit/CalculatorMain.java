package junit;

public class CalculatorMain {

    public static void main(String[] args) {

        //创建对象
        Calculator c = new Calculator();
        //调用
        int results = c.add(1, 2);
        System.out.println(results);

        int result = c.sub(1, 1);
        System.out.println(result);

        String str = "abc";
    }
}
