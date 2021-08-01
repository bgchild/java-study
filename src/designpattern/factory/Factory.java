package designpattern.factory;

import designpattern.factory.IFactory;

public class Factory implements IFactory {
    @Override
    public void createCar() {
        final Engine engine = new Engine();
        final Chassis chassis = new Chassis();
        final Tyre tyre = new Tyre();
        final Car car = new Car(engine, chassis, tyre);
        car.show();
    }
}
