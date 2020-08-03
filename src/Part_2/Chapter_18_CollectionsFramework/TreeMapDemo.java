package Part_2.Chapter_18_CollectionsFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        TreeMap<String,Double> hs = new TreeMap<>();

        hs.put("Beta",1.0);
        hs.put("Alpha",5.3);
        hs.put("Eta",9.3);
        hs.put("Gamma",6.3);
        hs.put("Omega",2.7);

        Set<Map.Entry<String,Double>> set = hs.entrySet();

        for (Map.Entry<String,Double> me:set) {
            System.out.println(me.getKey()+": ");
            System.out.println(me.getValue());
        }

        double balance = hs.get("Eta");
        hs.put("GEGe",balance + 1000);

        System.out.println("\nJoe execution: " + hs.get("GEGe"));
    }
}
