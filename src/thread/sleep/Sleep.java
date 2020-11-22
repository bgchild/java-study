package thread.sleep;

public class Sleep {
    public static void main(String[] args) {
        //模拟打印1分钟
        for (int i = 1; i <= 60; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }
}
