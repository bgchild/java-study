package designpattern.factory;

public class Engine {
    public void getStyle() {
        System.out.println("这是汽车发动机");
    }
}

class Chassis {
    public void getStyle() {
        System.out.println("这是汽车底盘");
    }
}

class Tyre {
    public void getStyle() {
        System.out.println("这厮汽车轮胎");
    }
}

