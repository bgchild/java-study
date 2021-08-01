package jvm.gc;

public class TestGc2 {
    private static TestGc2 obj;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("调用当前类重写的finalize()方法");
        //待回收的对象在finalize()方法中与引用链重新建立联系
        obj = this;
    }

    public static void main(String[] args) {
        try {
            //与堆区的内容建立引用
            obj = new TestGc2();
            //断开引用
            obj = null;
            System.out.println("第1次 gc");
            System.gc();//显式调用gc()
            //由于finalizer线程的优先级低，防止finalize方法没来得及调用
            Thread.sleep(2000);
            if (obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("obj is alive");
            }
            System.out.println("第2次 gc");
            //断开引用
            obj = null;
            //显式调用gc()
            System.gc();
            //由于finalizer线程的优先级低，防止finalize方法没来得及调用
            Thread.sleep(2000);
            if (obj == null) {
                System.out.println("obj is dead");
            } else {
                System.out.println("obj is alive");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
