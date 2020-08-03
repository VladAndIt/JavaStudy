package Part_2.Chapter_19_JavaUtils;

import java.util.Formatter;

public class FormatDemo {
    public static void main(String[] args) {
        Formatter fmt = new Formatter();
        for (double i = 1.23; i < 1.0e+3 ; i*=100) {
            fmt.format("%f - %e", i, i);
            System.out.println(fmt);
        }
        fmt.format("HEX: %x, Octal: %o", 196, 196);
        System.out.println(fmt);
        fmt.format("HEX: %a", 196.0);
        System.out.println(fmt);
        fmt = new Formatter();
        fmt.format("HEX: %.3s", "feefsfes");
        System.out.println(fmt);

        fmt.close();
    }
}
