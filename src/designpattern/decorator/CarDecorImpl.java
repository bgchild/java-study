package designpattern.decorator;

public class CarDecorImpl extends AttachedPropertiesDecorator {
    private String car = "有车";

    public CarDecorImpl(Man man) {
        super(man);
    }

    public void addCar() {
        System.out.print(car + " ");
    }

    @Override
    public void getManDesc() {
        super.getManDesc();
        addCar();
    }
}
