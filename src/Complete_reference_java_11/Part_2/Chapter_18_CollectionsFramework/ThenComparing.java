package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ThenComparing {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        CompLastNames compLN = new CompLastNames();
        //Comparator<String> compLastThenFirst = compLN.thenComparing(new CompThenByFirstName());
        Comparator<String> compLastThenFirst = compLN.reversed();

        //TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);
        TreeMap<String, Double> tm = new TreeMap<String, Double>((o1,o2)-> {
            int i,j;
            i = o1.lastIndexOf(' ');
            j = o2.lastIndexOf(' ');
            return o1.substring(i).compareToIgnoreCase(o2.substring(j));
        });

        tm.put("J South",0.1);
        tm.put("J.M South",67.4);
        tm.put("J.M North",6.96);
        tm.put("J.M East",24.5);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        //System.out.println("comparator" + Comparator.naturalOrder());
        //System.out.println("comparator" + Comparator.nullsFirst(compLastThenFirst));

        for (Map.Entry<String,Double> me: set) {
            System.out.println(String.format("%s - %s\n",me.getKey(),me.getValue()));
        }
        double balance = tm.get("J.M East");
        tm.put("J.M East", balance + 1000);

        for (Map.Entry<String,Double> account: set) {
            System.out.print(String.format("%s - %s \n", account.getKey(),account.getValue()));
        }


        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}

class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int i,j;

        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');
        return o1.substring(i).compareToIgnoreCase(o2.substring(j));
    }
}
class CompThenByFirstName implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}

