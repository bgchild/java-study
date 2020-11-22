package api.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Ann00
 * @date 2020/8/21
 */
public class dateFormat {
    public static void main(String[] args) {
        // 对应的日期格式如：2018-01-16 15:06:38
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));

    }
}
