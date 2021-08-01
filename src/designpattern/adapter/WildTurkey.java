package designpattern.adapter;

public class WildTurkey implements Turkey{
    @Override
    public void voice() {
        System.out.printf("ji ji");
    }
}
