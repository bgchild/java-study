package oop.extendskey;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class override {
    static class Fu {
        public void show() {
            System.out.println("Fu show");
        }
    }

    static class Zi extends Fu {
        //子类重写了父类的show方法
        @Override
        public void show() {
            System.out.println("Zi show");
        }
    }


    public static void main(String[] args) {
        Zi z = new Zi();
        // 子类中有show方法，只执行重写后的show方法
        z.show(); // Zi show
    }


}
