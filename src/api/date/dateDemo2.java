package api.date;

import java.util.Calendar;

public class dateDemo2 {
    public static void main(String[] args) {
        Calendar cl = Calendar.getInstance();
        long time = System.currentTimeMillis();
        System.out.println(cl);
        System.out.println(cl.get(Calendar.YEAR));
        System.out.println(cl.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(cl.getActualMaximum(Calendar.DAY_OF_MONTH));

        Calendar cl2 = Calendar.getInstance();
        cl2.add(Calendar.DATE,-1);
        System.out.println(cl2.getTime());
    }
}
