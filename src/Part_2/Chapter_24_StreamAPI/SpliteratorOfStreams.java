package Part_2.Chapter_24_StreamAPI;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorOfStreams {
    public static void main(String[] args) {
        ArrayDeque<String> hs = new ArrayDeque<>();

        hs.push("Beta");
        hs.push("Alpha");
        hs.push("Eta");
        hs.push("Gamma");
        hs.push("Omega");

        Stream<String> myStream = hs.stream();

        Spliterator<String> itr = myStream.spliterator();

        while (itr.tryAdvance(n -> System.out.print(n + ", ")));

        Stream<String> myStreamSplit = hs.stream();

        Spliterator<String> splitItr = myStreamSplit.spliterator();
        Spliterator<String> splitItr2 = splitItr.trySplit();

        if (splitItr2 != null) {
            System.out.println("\nOutput from splitItr2: ");
            splitItr2.forEachRemaining(n-> System.out.print(n + ", "));
        }

        System.out.println("\nOutput from splitItr: ");
        splitItr.forEachRemaining(n-> System.out.print(n + ", "));
    }
}
