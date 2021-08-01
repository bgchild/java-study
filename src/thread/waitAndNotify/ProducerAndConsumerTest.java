package thread.waitAndNotify;


/**
 * 消费者模型
 *
 * @author laok
 */
public class ProducerAndConsumerTest {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        Message message = new Message();
        while (true) {
            i++;
            message.setTitle("标题" + i);
            message.setContent("内容" + i);
            Producer producer = new Producer(message);
            Consumer consumer = new Consumer(message);
            new Thread(producer).start();
            new Thread(consumer).start();
            Thread.sleep(1000);
        }

    }
}

/**
 * 生产者
 */
class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {
            if (message.isFlag()) {
                try {
                    message.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("生产者生产一条消息：【" + message.getTitle() + "】" + message.getContent());
                message.setFlag(true);
                message.notify();
            }
        }
    }
}

/**
 * 消费者
 */
class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {
            if (message.isFlag()) {
                message.setFlag(false);
                System.out.println("消费者消费一条消息：【" + message.getTitle() + "】" + message.getContent());
                message.notify();
            } else {
                try {
                    message.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Message {
    private String title;
    private String content;
    private boolean flag;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
