package Complete_reference_java_11.Part_2.Chapter_19_JavaUtils;

import java.util.Scanner;

public class FindLineDemo {
    public static void main(String[] args) {
        String it = "Name: Tom, Age: 256, ID: 234";
        Scanner sf = new Scanner(it);
        sf.useDelimiter(", * ");
        sf.findInLine("Age:");
        if (sf.hasNext()) {
            System.out.println(sf.next());
        } else {
            System.out.println("Error!");
        }
        sf.close();

    }
}
