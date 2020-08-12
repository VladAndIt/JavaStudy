package Part_2.Chapter_24_StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.SortedMap;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mapping {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(0.32);
        myList.add(7.32);
        myList.add(3.2);
        myList.add(322.4);

        myList.stream().forEach(n->System.out.print(n + ", "));//print

        Stream<Double> sqrtStream = myList.stream().map(Math::sqrt);

        System.out.println();
        sqrtStream.forEach(n->System.out.print(n + ", "));
        System.out.println();

        sqrtStream = myList.stream().map(Math::sqrt);
        System.out.println(sqrtStream.collect(Collectors.toList()));
        sqrtStream = myList.stream().map(Math::sqrt);

        //THE BEST CASE PRINT STREAM
        sqrtStream.peek(s -> System.out.print(s + ",-")).count();

        sqrtStream = myList.stream().map(Math::sqrt);
        //        System.out.println(Arrays.toString(new Stream[]{sqrtStream}));

        double productOfSqrtRoots = sqrtStream.reduce(1.0, (a, b) -> a * b);

        System.out.println("\nProduct of square roots is " + productOfSqrtRoots);
    }
}
