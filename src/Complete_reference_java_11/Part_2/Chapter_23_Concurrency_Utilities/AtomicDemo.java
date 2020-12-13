package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new Thread(new AtomThread("A")).start();
        new Thread(new AtomThread("B")).start();
        new Thread(new AtomThread("C")).start();
    }
}

class SharedT {
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomThread implements Runnable {
    String name;

    AtomThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Starting " + name);
        for (int i = 1; i < 3; i++) {
            System.out.println(name + " got: " + SharedT.ai.getAndSet(i));
        }
    }
}
