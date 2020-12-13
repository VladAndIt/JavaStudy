package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.PatternMatching;

import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern pat7 = Pattern.compile("[ ,.!]");
        String strs[] = pat7.split("one two , alpha9 12!done.");

        for (int i = 0; i < strs.length; i++) {
            System.out.println("Next token:" + strs[i]);
        }
        String str2 = "dfaefw one";
        String input = "+12343454556";

        System.out.println("eadwdadw".matches(".*[a-z].*"));
    }
}
