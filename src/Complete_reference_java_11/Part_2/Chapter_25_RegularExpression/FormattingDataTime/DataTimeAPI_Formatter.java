package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.FormattingDataTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DataTimeAPI_Formatter {
    public static void main(String[] args) {
        LocalDate curDate = LocalDate.now();
        System.out.println(curDate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
        LocalTime curTime = LocalTime.now();
        System.out.println(curTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)));

        LocalDateTime curDateTime = LocalDateTime.now();
        System.out.println(curDateTime.format(DateTimeFormatter.ofPattern("MMMM d'.' yyyy h':'mm a")));
    }
}
