package Heap;

public class ThreadsOne {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//0.628

        Thread myThread = new Thread(() -> System.out.println("adadfa"));
        myThread.start();

        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
