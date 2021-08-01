package jvm.classInit;

/**
 * @ClassName Demo02
 * @Description 测试类的引用
 * @Author xwd
 * @Date 2018/10/23 21:58
 */
public class Demo02 {
    public static void main(String[] args) throws ClassNotFoundException {
        //主动引用：new一个类的对象
//        People people = new People();
//        //主动引用：调用类的静态成员(除了final常量)和静态方法
//        People.getAge();
//        System.out.println(People.age);
//        //主动调用：使用java.lang.reflect包的方法对类进行反射调用
//        Class.forName("jvm.People");


        //被动引用:当访问一个静态域时，只有真正声明这个域的类才会被初始化。
        System.out.println(WhitePeople.age);
        //被动引用:通过数组定义引用，不会初始化
//        People[] people = new People[10];
        //被动引用:引用常量不会触发此类的初始化
        System.out.println(People.num);
    }

    //主动调用：先启动main方法所在的类
    static {
        System.out.println("main方法所在的类在虚拟机启动时就加载");
    }
}

class People {

    static int age = 3;
    static final int num = 20;

    static {
        System.out.println("People被初始化了！");
    }

    public People() {
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        People.age = age;
    }
}

class WhitePeople extends People {

    static {
        System.out.println("WhitePeople被初始化了！");
    }
}
