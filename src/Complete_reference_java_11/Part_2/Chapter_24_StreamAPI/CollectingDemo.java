package Complete_reference_java_11.Part_2.Chapter_24_StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingDemo {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmailColl> myList = new ArrayList<>();
        myList.add(new NamePhoneEmailColl("Larry", "55555555", "Larry@faf.com"));
        myList.add(new NamePhoneEmailColl("Marcus", "0005463", "Marcus@faf.com"));
        myList.add(new NamePhoneEmailColl("Lee", "32467777", "Lee@faf.com"));
        myList.add(new NamePhoneEmailColl("Jeff", "3245646", "Jeff@faf.com"));

        System.out.println("Original values in myList: ");

        myList.stream().forEach(a -> {
            System.out.println(a.name + " " + a.phoneNum + " " + a.email);
        });

        System.out.println();

        Stream<NumPhoneColl> nameAndPhone = myList.stream().map(a -> new NumPhoneColl(a.name, a.phoneNum));
        //LIST FROM STREAM
        List<NumPhoneColl> npList = nameAndPhone.collect(Collectors.toList());
        System.out.println("Names and phones numbers in a List: ");
        for (NumPhoneColl r : npList) {
            System.out.println(r.name + ": " + r.phoneNum);
        }

        nameAndPhone = myList.stream().map(a -> new NumPhoneColl(a.name, a.phoneNum));

        Set<NumPhoneColl> npSet = nameAndPhone.collect(Collectors.toSet());

        System.out.println("\nNames and phones numbers in a Set: ");

        for (NumPhoneColl r : npSet) {
            System.out.println(r.name + ": " + r.phoneNum);
        }

        nameAndPhone = myList.stream().map(a -> new NumPhoneColl(a.name, a.phoneNum));

        System.out.println("\nNames and phones numbers in a LinkedList: ");
        LinkedList<NumPhoneColl> npLL = nameAndPhone.collect(() -> new LinkedList<>(),
                                                            (list, element) -> list.add(element),
                                                            (listA, listB) -> listA.addAll(listB));

        for (NumPhoneColl r : npLL) {
            System.out.println(r.name + ": " + r.phoneNum);
        }

        nameAndPhone = myList.stream().map(a -> new NumPhoneColl(a.name, a.phoneNum));

        System.out.println("\nNames and phones numbers in a HashSet: ");
        HashSet<NumPhoneColl> npHS = nameAndPhone.collect(HashSet::new,
                                                          HashSet::add,
                                                          HashSet::addAll);

        for (NumPhoneColl r : npHS) {
            System.out.println(r.name + ": " + r.phoneNum);
        }
    }
}

class NamePhoneEmailColl {
    String name;
    String phoneNum;
    String email;

    NamePhoneEmailColl(String name, String phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }
}

class NumPhoneColl {
    String name;
    String phoneNum;

    public NumPhoneColl(String name, String phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }
}
