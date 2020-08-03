package Part_2.Chapter_18_CollectionsFramework;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        ArrayList<Double> hs = new ArrayList<>();

        hs.add(0.1);
        hs.add(0.2);
        hs.add(0.3);
        hs.add(1.3);
        hs.add(5.3);

        System.out.println("Original contents of hs: ");
        Spliterator<Double> spiteratorMy = hs.spliterator();
        while (spiteratorMy.tryAdvance(n -> System.out.println(n)));
        spiteratorMy = hs.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (spiteratorMy.tryAdvance(n->sqrs.add(Math.sqrt(n))));
        spiteratorMy = sqrs.spliterator();
        spiteratorMy.forEachRemaining(n-> System.out.println(n));

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
