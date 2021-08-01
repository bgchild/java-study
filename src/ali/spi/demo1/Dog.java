package ali.spi.demo1;

/**
 * @author laok
 * @date 2021/7/31
 */
public class Dog implements IShout{
    @Override
    public void shout() {
        System.out.println("wang wang!");
    }
}
