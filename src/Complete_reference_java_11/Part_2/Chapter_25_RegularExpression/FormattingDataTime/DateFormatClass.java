package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.FormattingDataTime;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatClass {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat dateFormat;
        DateFormat dateFormat2 = DateFormat.getDateTimeInstance();


        dateFormat = DateFormat.getDateInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, Locale.TAIWAN);
        System.out.println("Taiwan: " + dateFormat.format(date));
        dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States : " + dateFormat.format(date));

        dateFormat = DateFormat.getTimeInstance(DateFormat.SHORT, Locale.JAPAN);
        System.out.println("Japan: " + dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM, Locale.KOREA);
        System.out.println("Korea: " + dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(DateFormat.LONG, Locale.TAIWAN);
        System.out.println("Taiwan: " + dateFormat.format(date));
        dateFormat = DateFormat.getTimeInstance(DateFormat.FULL, Locale.US);
        System.out.println("United States : " + dateFormat.format(date));
    }
}
