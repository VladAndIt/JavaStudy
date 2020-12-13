package Complete_reference_java_11.Part_2.Chapter_18_CollectionsFramework;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }
        System.out.println("Original contents:");
        display(array);
        Arrays.sort(array);
        System.out.println("Sorted : ");
        display(array);

        Arrays.fill(array,2,6,-1);
        System.out.println("After fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.println("After sorting again: ");
        display(array);

        System.out.println("The value -9 is at location ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    static void display(int array[]) {
        for (int i:array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

