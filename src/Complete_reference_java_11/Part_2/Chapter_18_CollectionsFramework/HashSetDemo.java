package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        HashSet<String> hs = new HashSet<>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Omega");

        System.out.println(String.format("<%s>",hs));

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
