package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.FormattingDataTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatClass {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat sdf;

        sdf = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("dd MM yyyy hh:mm:ss zzz");
        System.out.println(sdf.format(date));
        sdf = new SimpleDateFormat("E MMM dd yyyy");
        System.out.println(sdf.format(date));
    }
}
