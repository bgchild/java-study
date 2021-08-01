package designpattern.decorator;

public class NormalMan implements Man {
    private String name;

    public NormalMan(String name) {
        this.name = name;
    }

    @Override
    public void getManDesc() {
        System.out.printf(name + ":");
    }
}
