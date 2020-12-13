package Complete_reference_java_11.Part_2.Chapter_19_JavaUtils;

import java.util.Calendar;
import java.util.Formatter;

public class LeftJustifyDemo {
    public static void main(String[] args) {
        Formatter r = new Formatter();
        r.format("|%+-50.2f|", 123.123);
        System.out.println(r);
        r.close();
        r = new Formatter();
        r.format("|%-10.2f|", 123.123);
        System.out.println(r);
        r.close();
        r = new Formatter();
        r.format("|%2.2f|", -123.123);
        System.out.println(r);
        r.close();
        r = new Formatter();
        r.format("|% .2f|", 123.123);
        System.out.println(r);
        r.close();
        r = new Formatter();
        r.format("|%(d|", -123);
        System.out.println(r);
        r.close();
        r = new Formatter();
        r.format("|%2$.3f - %<s|", 123.123, 342.0);
        System.out.println(r);
        r.close();

        r = new Formatter();
        Calendar cal = Calendar.getInstance();
        r.format("Today is day %te of %<tB, %<tY", cal);
        System.out.println(r);
        r.close();

        try (Formatter trm = new Formatter()) {
            trm.format("Today is day %te of %<tB, %<tY", cal);
            System.out.println(trm);
        }
    }
}
