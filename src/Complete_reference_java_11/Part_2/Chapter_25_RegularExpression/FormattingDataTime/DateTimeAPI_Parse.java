package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.FormattingDataTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeAPI_Parse {
    public static void main(String[] args) {
        LocalDateTime curDateTime = LocalDateTime.parse("августа 13. 2020 11:24 AM", DateTimeFormatter.ofPattern("MMMM d'.' yyyy h':'mm a"));
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM d'.' yyyy h':'mm a")));
    }
}
