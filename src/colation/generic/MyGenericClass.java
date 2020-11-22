package colation.generic;

/**
 * @author Ann00
 * @date 2020/8/18
 */
public class MyGenericClass<Mvp> {
    //没有MVP类型，在这里代表 未知的一种数据类型 未来传递什么就是什么类型
    private Mvp mvp;

    public void setMvp(Mvp mvp) {
        this.mvp = mvp;
    }

    public Mvp getMvp() {
        return mvp;
    }
}
