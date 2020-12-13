package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingBasic {
    public static void main(String[] args) {
        Pattern pat;
        Matcher mat;
        boolean found;

        pat = Pattern.compile("Java");
        mat = pat.matcher("Java");
        found = mat.matches();

        System.out.println("Testing Java against Java.");
        if(found) System.out.println("Matches");
        else System.out.println("No Match");

        System.out.println();

        System.out.println("Testing Java against Java SE.");
        pat = Pattern.compile("Java SE");
        mat = pat.matcher("Java SE");
        found = mat.matches();
        if (found) {
            System.out.println("Matches!");
        } else System.out.println("No Match!");
    }
}
