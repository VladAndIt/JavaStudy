package Part_2.Chapter_25_RegularExpression.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharactersClass {
    public static void main(String[] args) {
        Pattern pat5 = Pattern.compile("[a-z]+");
        Matcher mat5 = pat5.matcher("this is a test");

        while (mat5.find()) {
            System.out.println("Match: " + mat5.group());
        }
    }
}
