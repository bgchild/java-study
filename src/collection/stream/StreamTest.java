package collection.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order("美的空调", 3, 2000));
        list.add(new Order("美的冰箱", 1, 1800));
        list.add(new Order("美的电饭锅", 1, 1000));
        list.add(new Order("斯密斯热水器", 1, 5000));
        list.add(new Order("老板油烟机", 1, 4000));
        final List<Order> mds = list.stream().filter(order -> order.getName().contains("美的")).collect(Collectors.toList());
        final Iterator<Order> iterator = mds.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}
