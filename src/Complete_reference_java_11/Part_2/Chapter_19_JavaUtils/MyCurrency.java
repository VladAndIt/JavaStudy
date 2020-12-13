package Complete_reference_java_11.Part_2.Chapter_19_JavaUtils;

import java.util.Currency;
import java.util.Locale;

public class MyCurrency {
    public static void main(String[] args) {
        Currency c;
        c = Currency.getInstance(Locale.CHINA);
        System.out.println("Symbol : " + c.getSymbol());
        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());
        c = Currency.getInstance(Locale.GERMANY);
        System.out.println("Symbol : " + c.getSymbol());
        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());
        c = Currency.getInstance(Locale.ITALY);
        System.out.println("Symbol : " + c.getSymbol());
        System.out.println("Default fractional digits: " + c.getDefaultFractionDigits());
    }
}
