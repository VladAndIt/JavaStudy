package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        ArrayDeque<String> hs = new ArrayDeque<>();

        hs.push("Beta");
        hs.push("Alpha");
        hs.push("Eta");
        hs.push("Gamma");
        hs.push("Omega");

        while (hs.peek() != null) {
            System.out.print(String.format("<%s>",hs.pop()));
        }

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
