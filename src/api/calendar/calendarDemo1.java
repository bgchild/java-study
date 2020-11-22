package api.calendar;

import java.util.Calendar;

/**
 * @author Ann00
 * @date 2020/8/21
 * `public static Calendar getInstance()`：使用默认时区和语言环境获得一个日历
 */
public class calendarDemo1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
    }
}
