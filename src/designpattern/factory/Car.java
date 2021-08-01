package designpattern.factory;

public class
Car {
    Engine engine;
    Chassis chassis;
    Tyre tyre;

    public Car(Engine engine, Chassis chassis, Tyre tyre) {
        this.engine = engine;
        this.chassis = chassis;
        this.tyre = tyre;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void show() {
        engine.getStyle();
        chassis.getStyle();
        tyre.getStyle();
        System.out.println("这是一辆汽车");
    }
}
