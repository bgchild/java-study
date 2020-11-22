package colation.generic;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class genericClassDemo {
    public static void main(String[] args) {
        // 创建一个泛型为String的类
        MyGenericClass<String> my = new MyGenericClass<>();
        // 调用setMVP
        my.setMvp("大胡子登登");
        // 调用getMVP
        String mvp = my.getMvp();
        System.out.println(mvp);
        //创建一个泛型为Integer的类
        MyGenericClass<Integer> my2 = new MyGenericClass<>();
        my2.setMvp(123);
        Integer mvp2 = my2.getMvp();
    }
}
