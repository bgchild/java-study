package jvm.classInit;

/**
 * 定义对象数组，不会触发该类的初始化。
 */
public class Init2 {
    public static void main(String[] args){
        Parent[] parents = new Parent[10];
    }
}
