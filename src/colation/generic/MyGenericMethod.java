package colation.generic;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class MyGenericMethod {
    public <MVP> void show(MVP mvp) {
        System.out.println(mvp.getClass());
    }

    public <MVP> MVP show2(MVP mvp) {
        return mvp;
    }
}
