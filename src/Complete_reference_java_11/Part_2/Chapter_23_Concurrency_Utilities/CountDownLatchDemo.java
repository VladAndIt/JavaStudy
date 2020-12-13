package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch cd1 = new CountDownLatch(5);

        System.out.println("Starting");

        new Thread(new MyThread(cd1)).start();

        try {
            cd1.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done!");
    }
}

class MyThread implements Runnable {
    CountDownLatch latch;
    public MyThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            latch.countDown();
        }
    }


}