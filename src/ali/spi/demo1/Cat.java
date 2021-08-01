package ali.spi.demo1;

/**
 * @author laok
 * @date 2021/7/31
 */
public class Cat implements IShout {
    @Override
    public void shout() {
        System.out.println("mi mi!");
    }
}
