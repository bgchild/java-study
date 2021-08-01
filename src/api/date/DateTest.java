package api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化处理
 *
 * @author Ann00
 * @date 2020/8/21
 * - `public String format(Date date)`：将Date对象格式化为字符串。
 * - `public Date parse(String source)`：将字符串解析为Date对象。
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
        //将时间转换为指定格式字符串
        final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String format = sdf.format(date);
        System.out.println(format);
        //将时间字符串转换为时间
        final Date parse = sdf.parse(format);
        System.out.println(parse);
    }
}
