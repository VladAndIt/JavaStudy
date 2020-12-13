package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class MyComparator {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        TreeSet<String> ts = new TreeSet<>(new MyComp());
        ts.add("Beta");
        ts.add("Alph");
        ts.add("Eta");
        ts.add("Gamm");
        ts.add("Omeg");
        for (String element : ts) {
            System.out.print(element + " ");
        }
        System.out.println();
        TreeSet<String> ts2 = new TreeSet<>(new MyOriginalComp());
        ts2.add("Beta");
        ts2.add("Alph");
        ts2.add("Eta");
        ts2.add("Gamm");
        ts2.add("Omeg");
        for (String element:ts2) {
            System.out.print(element + " ");
        }
        System.out.println();
        MyOriginalComp ms = new MyOriginalComp();
        TreeSet<String> ts3 = new TreeSet<>(ms.reversed());
        ts3.add("Beta");
        ts3.add("Alph");
        ts3.add("Eta");
        ts3.add("Gamm");
        ts3.add("Omeg");
        for (String element:ts3) {
            System.out.print(element + " ");
        }
        System.out.println();
        TreeSet<String> ts4 = new TreeSet<>((aStr,bStr)->aStr.compareTo(bStr));
        ts4.add("Beta");
        ts4.add("Alph");
        ts4.add("Eta");
        ts4.add("Gamm");
        ts4.add("Omeg");
        for (String element:ts4) {
            System.out.print(element + " ");
        }
        System.out.println();
        TreeSet<String> ts5 = new TreeSet<>((aStr,bStr)->bStr.compareTo(aStr));
        ts5.add("Beta");
        ts5.add("Alph");
        ts5.add("Eta");
        ts5.add("Gamm");
        ts5.add("Omeg");
        for (String element:ts5) {
            System.out.print(element + " ");
        }

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}

class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }

}
class MyOriginalComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}