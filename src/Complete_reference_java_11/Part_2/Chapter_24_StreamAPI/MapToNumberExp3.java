package Complete_reference_java_11.Part_2.Chapter_24_StreamAPI;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MapToNumberExp3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(0.32);
        myList.add(7.32);
        myList.add(3.2);
        myList.add(322.4);

        System.out.println("Original values in myList: ");
        myList.stream().forEach(a -> System.out.println(a + " "));
        System.out.println();

        IntStream cStrm = myList.stream().mapToInt(a -> (int) Math.ceil(a));
        System.out.println("The ceilings of the values in myList: ");
        cStrm.forEach(a -> System.out.println(a + " "));

    }
}
