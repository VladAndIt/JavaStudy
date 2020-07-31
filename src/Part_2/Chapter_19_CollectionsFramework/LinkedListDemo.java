package Part_2.Chapter_19_CollectionsFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        LinkedList<String> LL = new LinkedList<>();
        for (int i = 65; i < 90; i++) {
            LL.add(String.valueOf((char) i).toUpperCase());
        }

        System.out.println(String.format("Size of LL before addLast : %s  Content: %s", LL.size(),LL));

        LL.addFirst("Root");
        LL.offerFirst("FirstOffer");

        LL.addLast("Zoo");
        LL.offerLast("LastOffer");

        System.out.println(String.format("Size of LL after addLast : %s  Content: %s", LL.size(),LL));

        LL.add(4, "AddByIndex");

        System.out.println(String.format("Size of LL after addIndex A2, before remote 2 and Zoo : %s  Content: %s", LL.size(),LL));

        LL.remove(2);
        LL.remove("Zoo");

        System.out.println(String.format("Size of LL after remote 2 and Zoo : %s Content: %s", LL.size(),LL));

        LL.removeFirst();
        LL.removeLast();

        System.out.println(String.format("Size of LL after remote last first  : %s Content: %s", LL.size(),LL));

        String val = LL.get(7);
        LL.set(7,val + "Changed");

        System.out.println(String.format("Size of LL after all : %s Content: %s", LL.size(),LL));

        var Info = new StringBuilder();
        Info.append("Time execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.");
        System.out.println(Info);
    }
}
