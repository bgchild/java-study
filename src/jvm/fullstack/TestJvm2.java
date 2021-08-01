package jvm.fullstack;


import org.openjdk.jol.info.ClassLayout;

public class TestJvm2 {
    public static void main(String[] args) {
        Object obj = new Object();
        System.out.println(ClassLayout.parseInstance(obj).toPrintable());
    }
}
