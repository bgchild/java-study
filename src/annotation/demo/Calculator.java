package annotation.demo;


/**
 * 小明定义的计算器类
 * @author laok
 */
public class Calculator {


    @Check
    public void add() {
        String str = null;
        System.out.println("1 + 0 =" + (1 + 0));
    }


    @Check
    public void sub() {
        System.out.println("1 - 0 =" + (1 - 0));
    }


    @Check
    public void mul() {
        System.out.println("1 * 0 =" + (1 * 0));
    }


    @Check
    public void div() {
        System.out.println("1 / 0 =" + (1 / 0));
    }

    public void show() {
        System.out.println("永无bug...");
    }

}
