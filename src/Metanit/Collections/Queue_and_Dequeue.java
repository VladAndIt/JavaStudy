package Metanit.Collections;

import java.util.ArrayDeque;

public class Queue_and_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<String> states = new ArrayDeque<>();

        states.addFirst("France");
        states.addLast("Spain");

        System.out.println("\nGet  first/last: " + states.getFirst()  + ", " + states.getLast()  + String.format(" - size: %d", states.size()) + " show with exception.");

        states.offerFirst("Herman");
        states.offerLast("Harry");

        System.out.println("Peek first/last: " + states.peekFirst() + ", " + states.peekLast() + String.format(" - size: %d", states.size())  + " show with null.\n");

        states.add("Italy");
        states.add("Poll");
        states.add("Adam");

        while (states.peek() != null) {
            System.out.print(states.pop() + " | ");
        }

        System.out.println("\nPoll first/last: " + states.pollFirst() + ", " + states.pollLast() + String.format(" - size: %d", states.size())  + " delete with null.\n");

        while (states.peek() != null) {
            System.out.print(states.pop() + " | ");
        }

        System.out.println();

        ArrayDeque<Person> people = new ArrayDeque<Person>();

        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));

        for (Person p:people) {
            System.out.print(p.getName() + " ");
        }
    }
}

class Person {
    private String name;

    public Person(String value) {
        name = value;
    }

    String getName() {
        return name;
    }
}