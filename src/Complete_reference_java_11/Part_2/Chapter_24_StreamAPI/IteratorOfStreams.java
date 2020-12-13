package Complete_reference_java_11.Part_2.Chapter_24_StreamAPI;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.stream.Stream;

public class IteratorOfStreams {
    public static void main(String[] args) {
        ArrayDeque<String> hs = new ArrayDeque<>();

        hs.push("Beta");
        hs.push("Alpha");
        hs.push("Eta");
        hs.push("Gamma");
        hs.push("Omega");

        Stream<String> myStream = hs.stream();

        Iterator<String> itr = myStream.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        Iterator<String> itr2 = hs.stream().iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }


    }
}
