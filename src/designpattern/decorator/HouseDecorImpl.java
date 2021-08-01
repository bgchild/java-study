package designpattern.decorator;

import oop.statics.A;

public class HouseDecorImpl extends AttachedPropertiesDecorator {
    String house = "有房";

    public HouseDecorImpl(Man man) {
        super(man);
    }

    void addHouse(){
        System.out.printf(house+" ");
    }

    @Override
    public void getManDesc() {
        super.getManDesc();
        addHouse();
    }
}
