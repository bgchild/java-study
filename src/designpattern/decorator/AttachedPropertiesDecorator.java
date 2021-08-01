package designpattern.decorator;

public class AttachedPropertiesDecorator implements Man {
    private Man man;

    public AttachedPropertiesDecorator(Man man) {
        this.man = man;
    }


    @Override
    public void getManDesc() {
        man.getManDesc();
    }
}
