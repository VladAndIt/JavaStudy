package Complete_reference_java_11.Part_2.Chapter_24_StreamAPI;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class BasicStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(34);
        myList.add(4234);
        myList.add(342);
        myList.add(4334);
        myList.add(3);
        myList.add(5);
        myList.add(7);
        myList.add(17);

        System.out.println("Original list: " + myList);

        Stream<Integer> myStream = myList.stream();
        Optional<Integer> minVal = myStream.min(Double::compare);
        if(minVal.isPresent()) System.out.println("Minimum value " + minVal.get());

        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) System.out.println("Maximum value " + maxVal.get());

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Sorted stream: ");
        sortedStream.forEach(n -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> oddVals = myList.stream().sorted().filter(n -> (n % 2) == 1);
        System.out.println("\nOdd values: ");
        oddVals.forEach(n -> System.out.print(n + " "));

        oddVals = myList.stream().filter(n->(n%2) == 1).filter(n -> n > 5);
        System.out.println("\nOdd values greater than 5: ");
        oddVals.forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
