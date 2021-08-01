package ali.spi.demo1;

import java.util.ServiceLoader;

/**
 * 如何定义 SPI
 *
 * @author laok
 * @date 2021/7/31
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<IShout> shouts = ServiceLoader.load(IShout.class);
        for (IShout s : shouts) {
            s.shout();
        }
    }
}
