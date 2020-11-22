package oop.extendskey.demo;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class ChengYuan extends User {

    public ChengYuan() {
    }

    public ChengYuan(String userName, Double money) {
        super(userName, money);
    }

    // 打开红包,就是从集合中,随机取出一份,保存到自己的余额中
    public void openRedPackage(ArrayList<Double> list) {
        // 创建Random对象
        Random r = new Random();
        // 随机生成一个角标
        int index = r.nextInt(list.size());
        // 移除一个金额
        Double money = list.remove(index);
        // 直接调用父类方法,设置到余额
        setMoney(money);
    }
}
