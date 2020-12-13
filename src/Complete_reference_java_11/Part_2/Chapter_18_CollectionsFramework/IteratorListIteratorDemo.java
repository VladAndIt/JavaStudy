package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorListIteratorDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        ArrayList<String> hs = new ArrayList<>();

        hs.add("Beta");
        hs.add("Alpha");
        hs.add("Eta");
        hs.add("Gamma");
        hs.add("Omega");

        System.out.println("Original contents of hs: ");
        Iterator<String> itr = hs.iterator();

        while(itr.hasNext()) {
            String element  = itr.next();
            System.out.print(String.format("<%s>", element));
        }
        //Iterator<String> itr = hs.iterator();
        for (String element : hs) {
            System.out.print(String.format("<%s>", element));
        }


        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
