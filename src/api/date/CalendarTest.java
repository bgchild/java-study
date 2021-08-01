package api.date;

import javax.xml.soap.SOAPMessage;
import java.util.Calendar;
import java.util.Date;

/**
 * 常用方法
 * - `public int get(int field)`：返回给定日历字段的值。
 * - `public void set(int field, int value)`：将给定的日历字段设置为给定值。
 * - `public abstract void add(int field, int amount)`：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
 * - `public Date getTime()`：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
 */
public class CalendarTest {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        final int Y = calendar.get(Calendar.YEAR);
        final int M = calendar.get(Calendar.MONTH) + 1;
        final int D = calendar.get(Calendar.DATE);
        System.out.println(Y+"年"+M+"月"+D+"日");
        final Date time = calendar.getTime();
        System.out.println(time);
    }
}
