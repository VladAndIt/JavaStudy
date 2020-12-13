package Complete_reference_java_11.Part_2.Chapter_19_JavaUtils;

import java.util.Optional;

public class MyOptional {
    public static void main(String[] args) {
        Optional<String> noVal = Optional.empty();
        Optional<String> hasVal = Optional.of("ABCDEFG");

        if (noVal.isPresent()) {
            System.out.println("This won't be displayed");
        }else System.out.println("noVal has no value");
        if (hasVal.isPresent()) {
            System.out.println("The string in hasVal is: " + hasVal.get());
        }

        String defStr = noVal.orElse("Default String");
        System.out.println(defStr);
    }
}