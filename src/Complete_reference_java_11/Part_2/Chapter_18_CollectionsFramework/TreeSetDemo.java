package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String [] args){
        long startTime = System.currentTimeMillis();

        TreeSet<String> treeS = new TreeSet<>();

        for (int i = 65; i <= 90; i++) {
            treeS.add(String.valueOf((char) i).toUpperCase());
        }
        System.out.println(String.format("<%s>,\n<%s>",treeS,treeS.subSet("T","Z")));

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
