package Complete_reference_java_11.Part_2.Chapter_24_StreamAPI;

import java.util.ArrayList;

public class ParallelReduce {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();

        myList.add(4.3);
        myList.add(4.23);
        myList.add(43.3);
        myList.add(44.3);

        double productOfSqrtRoots = myList.parallelStream().reduce(1.0, (a, b) -> a * Math.sqrt(b),
                                                                                (a, b) -> a * b);

        System.out.println("Product of square roots: " + productOfSqrtRoots);
    }
}
