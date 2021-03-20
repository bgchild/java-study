package thread.threadPool;

public class MyTask implements Runnable {
    private int taskId;
    private String taskName;

    public MyTask(int taskId, String taskName) {
        this.taskId = taskId;
        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return "MyTask [taskId=" + taskId + ", taskName=" + taskName + "]";
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + "-----------run taskId=" + this.taskId);
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
