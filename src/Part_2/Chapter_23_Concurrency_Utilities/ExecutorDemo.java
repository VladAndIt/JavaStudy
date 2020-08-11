package Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);
        CountDownLatch cd2 = new CountDownLatch(5);
        CountDownLatch cd3 = new CountDownLatch(5);
        CountDownLatch cd4 = new CountDownLatch(5);
        ExecutorService es = Executors.newFixedThreadPool(3);

        System.out.println("Starting");

        es.execute(new MyThread4(cd1, "A"));
        es.execute(new MyThread4(cd2, "B"));
        es.execute(new MyThread4(cd3, "C"));
        es.execute(new MyThread4(cd4, "D"));

        try {
            cd1.await();
            cd2.await();
            cd3.await();
            cd4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        es.shutdown();
        System.out.println("Done");
    }
}

class MyThread4 implements Runnable {
    String name;
    CountDownLatch latch;

    public MyThread4(CountDownLatch latch, String name) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
