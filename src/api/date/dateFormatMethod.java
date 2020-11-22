package api.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ann00
 * @date 2020/8/21
 * - `public String format(Date date)`：将Date对象格式化为字符串。
 * - `public Date parse(String source)`：将字符串解析为Date对象。
 */
public class dateFormatMethod {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        // 创建日期格式化对象,在获取格式化对象时可以指定风格
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String str = df.format(date);
        System.out.println(str); // 2008年1月23日


        String str2 = "2018年12月11日";
        Date dates = df.parse(str);
        System.out.println(date); // Tue Dec 11 00:00:00 CST 2018
    }
}
