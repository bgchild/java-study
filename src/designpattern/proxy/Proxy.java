package designpattern.proxy;

public class Proxy extends Subject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    void request() {
        this.before();
        this.realSubject.request();
        this.after();
    }

    void before() {
        System.out.println("请求前处理......");
    }

    void after() {
        System.out.println("请求后处理......");
    }
}
