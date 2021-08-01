package generic;

/**
 * @author Ann00
 * @date 2020/8/18
 * 泛型类
 */
public class GenericClass<E> {

    private E e;

    public void setMvp(E e) {
        this.e = e;
    }

    public E getMvp() {
        return e;
    }
}
