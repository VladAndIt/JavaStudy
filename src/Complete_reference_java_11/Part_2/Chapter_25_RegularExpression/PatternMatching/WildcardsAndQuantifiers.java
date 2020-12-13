package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WildcardsAndQuantifiers {
    public static void main(String[] args) {
        Pattern pat2 = Pattern.compile("W+");
        Matcher mat2 = pat2.matcher("W WW WWW");
        while (mat2.find()) {
            System.out.println("Match: " + mat2.group());
        }

        Pattern pat3 = Pattern.compile("e.+d");
        Matcher mat3 = pat3.matcher("extend cup end table");

        while (mat3.find()) {
            System.out.println("Match: " + mat3.group());
        }
        Pattern pat4 = Pattern.compile("e.+?d");
        Matcher mat4 = pat4.matcher("extend cup end table");

        while (mat4.find()) {
            System.out.println("Match: " + mat4.group());
        }
        Pattern pat5 = Pattern.compile("e.?+d");//{min,limit}
        Matcher mat5 = pat5.matcher("extend cup end table");

        while (mat5.find()) {
            System.out.println("Match: " + mat5.group());
        }


    }
}
