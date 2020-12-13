package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.PatternMatching;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDemo {
    public static void main(String[] args) {
        Pattern pat = Pattern.compile("Java");
        Matcher mat = pat.matcher("Java SE");
        System.out.println("Looking for Java in Java SE");

        if (mat.find()) System.out.println("subsequence found");
        else System.out.println("No Match");

        Pattern pat1 = Pattern.compile("test");
        Matcher mat1 = pat1.matcher("test 1 2 3 test adakksajfgkjeejdw  test");
        while (mat1.find()) {
            System.out.println("Sequence 'test' is found " + mat1.start());
        }
    }
}
