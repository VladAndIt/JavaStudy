package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReplaceAll {
    public static void main(String[] args) {
        String str = "Jon Jonathan Frank Ken Todd";

        Pattern pat6 = Pattern.compile("Jon.*? ");
        Matcher mat6 = pat6.matcher(str);
        System.out.println("The original sequence: " + str);
        str = mat6.replaceAll("Eric ");
        System.out.println("The changed sequence: " + str);

    }
}
