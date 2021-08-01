package collection.stream;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * MapReduce基础模型
 * @author laok
 */
public class StreamTest1 {
    public static void main(String[] args) {
        List<Order> list = new ArrayList<>();
        list.add(new Order("美的空调", 3, 2000));
        list.add(new Order("美的冰箱", 1, 1800));
        list.add(new Order("美的电饭锅", 1, 1000));
        list.add(new Order("斯密斯热水器", 1, 5000));
        list.add(new Order("老板油烟机", 1, 4000));
        final DoubleSummaryStatistics md = list.stream().filter(order -> order.getName().contains("美的")).mapToDouble(order -> order.getNum() * order.getPrice()).summaryStatistics();
        System.out.println(md.getMax());
        System.out.println(md.getMin());
        System.out.println(md.getAverage());
    }
}
