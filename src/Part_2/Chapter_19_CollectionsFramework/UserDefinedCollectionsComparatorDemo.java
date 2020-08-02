package Part_2.Chapter_19_CollectionsFramework;

import java.util.*;

public class UserDefinedCollectionsComparatorDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        TreeMap<String,Double> TreeMapAddress = new TreeMap<>();

        TreeMapAddress.put("J South",0.0);
        TreeMapAddress.put("J.M South",67.4);
        TreeMapAddress.put("J.M North",6.96);
        TreeMapAddress.put("J.M East",24.5);

        Set<Map.Entry<String, Double>> set = TreeMapAddress.entrySet();

        for (Map.Entry<String,Double> account: set) {
            System.out.print(String.format("%s - %s \n", account.getKey(),account.getValue()));
        }

        double balance = TreeMapAddress.get("J.M East");
        TreeMapAddress.put("J.M East", balance + 1000);

        for (Map.Entry<String,Double> account: set) {
            System.out.print(String.format("%s - %s \n", account.getKey(),account.getValue()));
        }

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
