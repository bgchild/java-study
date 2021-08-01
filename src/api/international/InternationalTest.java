package api.international;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.*;

/**
 * 国际化
 */
public class InternationalTest {
    public static void main(String[] args) {
        final Locale aDefault = Locale.getDefault();
        System.out.println(aDefault);

        final Locale localeZh = new Locale("zh", "CN");
        Locale localeUs = new Locale("en", "US");
        ResourceBundle rzh = ResourceBundle.getBundle("language", localeZh);
        ResourceBundle rus = ResourceBundle.getBundle("language", localeUs);
        System.out.println(rzh.getString("helloWord"));
        System.out.println(rus.getString("helloWord"));

        NumberFormat format = NumberFormat.getCurrencyInstance(localeZh);

        //NumberFormat
        double num = 123456.789;
        System.out.println(String.format("%s : %s", localeZh, format.format(num)));

        //DateFormat
        final DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, localeZh);
        final String format1 = df.format(new Date());
        System.out.println(format1);

        //MessageFormat
        String pattern1 = "{0}，你好！你于  {1} 消费  {2} 元。";
        String pattern2 = "At {1,time,short} On {1,date,long}，{0} paid {2,number, currency}.";
        Object[] params = {"Jack", new GregorianCalendar().getTime(), 8888};
        String msg1 = MessageFormat.format(pattern1, params);
        MessageFormat mf = new MessageFormat(pattern2, Locale.US);
        String msg2 = mf.format(params);
        System.out.println(msg1);
        System.out.println(msg2);
    }
}
