package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class MyArrayList {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        ArrayList<String> al = new ArrayList<String>();
        ArrayList<Integer> al2 = new ArrayList<>();

        System.out.println(String.format("Initial size of al: %s", al.size()));

        for (int i = 65; i < 90; i++) {
            al.add(String.valueOf((char) i).toUpperCase());
        }
        System.out.println(String.format("Size of al after additions : %s \n Content: %s", al.size(),al));

        al.remove("A");
        al.remove(2);

        System.out.println(String.format("Size of al after deletions : %s \n Content: %s  ", al.size(),al));

        System.out.println(String.format("Initial size of al2: %s", al2.size()));
        for (int i = 0; i < 10; i++) {
            al2.add(i);
        }
        Integer ia[]= new Integer[al2.size()];
        ia = al2.toArray(ia);
        int sum = 0;
        for (int i : ia) {
            sum += i;
        }
        System.out.println(String.format("Size of al after deletions : %s \n Content: %s  ", al2.size(),al2));
        System.out.println(Arrays.toString(ia) + " , " + sum);
        var Info = new StringBuilder();
        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");
        System.out.println(Info);
    }
}
