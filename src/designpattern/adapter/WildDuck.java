package designpattern.adapter;

public class WildDuck implements Duck{
    @Override
    public void voice() {
        System.out.printf("ya ya");
    }
}
