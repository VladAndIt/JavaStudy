package Part_2.Chapter_24_StreamAPI;

import java.util.ArrayList;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();

        myList.add(64);
        myList.add(32);
        myList.add(642);
        myList.add(4);

        //the first approach
        Optional<Integer> productObj = myList.stream().reduce((integer, integer2) -> integer * integer2);
        if (productObj.isPresent()) System.out.println("Product as Option: " + productObj.get());

        int product = myList.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product as int: " + product);

        //parallel stream
        int product2 = myList.parallelStream().reduce(1, (a, b) -> a * b);
        System.out.println("Product as parallel int: " + product2);

        int eventProduct = myList.stream().reduce(1, (a, b) -> {
            if (b % 2 == 0) return a * b;
            else return a;
        });
        System.out.println("Even product as int: " + eventProduct);
    }
}
