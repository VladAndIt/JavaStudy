package Complete_reference_java_11.Part_2.Chapter_19_JavaUtils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        long msec = date.getTime();
        System.out.println("Milliseconds since Jan. 1 , 1970 GMT = " + msec);

        String months[] = {
            "Jan", "Feb", "Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"
        };

        Calendar calendar = Calendar.getInstance();
        System.out.println("Date: ");
        System.out.println(months[calendar.get(Calendar.MONTH)] + " " + calendar.get(Calendar.DATE) + " " + calendar.get(Calendar.YEAR));

        System.out.println("Time: ");
        System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        calendar.set(Calendar.HOUR,10);
        calendar.set(Calendar.MINUTE,12);
        calendar.set(Calendar.SECOND,22);

        System.out.println("Update time: ");
        System.out.println(calendar.get(Calendar.HOUR) + ":" + calendar.get(Calendar.MINUTE) + ":" + calendar.get(Calendar.SECOND));

        System.out.println("Georgian calendar");

        GregorianCalendar Gcalendar = new GregorianCalendar();
        int year;
        System.out.println("Date: ");
        System.out.println(months[Gcalendar.get(Calendar.MONTH)] + " " + Gcalendar.get(Calendar.DATE) + " " + (year = Gcalendar.get(Calendar.YEAR)));

        System.out.println("Time: ");
        System.out.println(Gcalendar.get(Calendar.HOUR) + ":" + Gcalendar.get(Calendar.MINUTE) + ":" + Gcalendar.get(Calendar.SECOND));

        Gcalendar.set(Calendar.HOUR,10);
        Gcalendar.set(Calendar.MINUTE,12);
        Gcalendar.set(Calendar.SECOND,22);

        System.out.println("Update time: ");
        System.out.println(Gcalendar.get(Calendar.HOUR) + ":" + Gcalendar.get(Calendar.MINUTE) + ":" + Gcalendar.get(Calendar.SECOND));

        if (Gcalendar.isLeapYear(year)) System.out.println("The current year is a leap year!");
        else System.out.println("ins't leap year");
    }
}
