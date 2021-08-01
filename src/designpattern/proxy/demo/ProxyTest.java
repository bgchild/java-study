package designpattern.proxy.demo;

interface Message {
    /**
     * 发送消息
     */
    void send();
}

class MessageImpl implements Message {

    @Override
    public void send() {
        System.out.println("send a message");
    }
}

class MyProxy implements Message {
    private MessageImpl message;

    public MyProxy() {
        this.message = new MessageImpl();
    }


    private void before() {
        System.out.println("connected...");
    }

    private void after() {
        System.out.println("closed...");
    }

    @Override
    public void send() {
        this.before();
        message.send();
        this.after();
    }
}

/**
 * 静态代理
 *
 * @author laok
 */
public class ProxyTest {
    public static void main(String[] args) {
        MyProxy myProxy = new MyProxy();
        myProxy.send();
    }
}
