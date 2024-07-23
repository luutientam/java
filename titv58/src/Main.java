import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis();
        for (int i = 1; i < 100; i++) {
            System.out.println("hi ");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("truoc khi chay for " + t1);
        System.out.println("truoc khi chay for " + t2);
        System.out.println("chay for het " + (t2 - t1));
        System.out.println();
        //TimeUnit
        System.out.println("yeu em 3000 nam " + TimeUnit.DAYS.toSeconds(3000 * 365) + " giay");
        System.out.println("25h " + TimeUnit.HOURS.toSeconds(25) + " giay");
        System.out.println("1,3h " + TimeUnit.MINUTES.toSeconds((long) (1.3 * 60)) + " giay");
        // sql.Date
        Date d = new java.sql.Date(System.currentTimeMillis());
        System.out.println(d.getDate() + " " + (d.getMonth() + 1) + " " + (d.getYear() + 1900));


        // calendar
        Calendar c = Calendar.getInstance();

        System.out.println(c.get(Calendar.DATE) + " " + (c.get(Calendar.MONTH) + 1) + " " + c.get(Calendar.YEAR));
        // them gio
        c.add(Calendar.HOUR, 30);
        System.out.println(c.get(Calendar.DATE) + " " + (c.get(Calendar.MONTH) + 1) + " " + c.get(Calendar.YEAR) + " " + c.get(Calendar.HOUR));
        // them ngay
        c.add(Calendar.DATE, 10);
        System.out.println(c.get(Calendar.DATE) + " " + (c.get(Calendar.MONTH) + 1) + " " + c.get(Calendar.YEAR) + " " + c.get(Calendar.HOUR));
        // DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));
    }
}
