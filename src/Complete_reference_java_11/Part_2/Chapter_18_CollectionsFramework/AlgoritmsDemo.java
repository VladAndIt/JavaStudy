package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgoritmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(99999);
        ll.add(20);
        ll.add(-8);
        ll.add(86);

        for (int i : ll) {
            System.out.print( i + " ");
        }
        System.out.println();
        Comparator<Integer> r = Collections.reverseOrder();

        Collections.sort(ll,r);

        for (int i : ll) {
            System.out.print( i + " ");
        }
        System.out.println();
        Collections.shuffle(ll);

        for (int i : ll) {
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("min " + Collections.min(ll));
        System.out.println("max " + Collections.max(ll));

    }
}
