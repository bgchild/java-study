package designpattern.proxy;

public class RealSubject extends Subject{
    @Override
    void request() {
        System.out.println("真实的请求:"+"RealSubject");
    }
}
