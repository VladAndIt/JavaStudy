package Metanit.Collections;

import java.util.ArrayList;

public class ArrayList_and_List {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();

        people.add("Tom");
        people.add("Jack");
        people.add("Alice");
        people.add( 1,"Bob");
        System.out.printf("\n %s \n",people.get(1));
        for (String i:people) {
            System.out.print(i + " ");
        }
        people.set(1,"John");
        System.out.printf("\n %s \n",people.get(1));
        for (String i:people) {
            System.out.print(i + " ");
        }

        if (people.contains("Alice")) System.out.println("\nAlice is present");
        System.out.printf("\nAfter add by index and set , size is %d: \n", people.size());
        System.out.println();
        people.remove("John");

        for (String i:people) {
            System.out.print(i + " ");
        }

        people.remove(0);
        System.out.println();
        for (String i:people) {
            System.out.print(i + " ");
        }
        System.out.println();
        Object[] peopleInArray = people.toArray();

        for (Object i:peopleInArray) {
            System.out.print(i + " ");
        }

        System.out.println("\nAfter all");
    }
}
