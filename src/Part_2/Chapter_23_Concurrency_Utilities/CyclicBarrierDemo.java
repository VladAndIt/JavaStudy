package Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cd = new CyclicBarrier(3, new BarAction());

        System.out.println("Starting");
        new Thread(new MyThread1(cd,"A")).start();
        new Thread(new MyThread1(cd,"B")).start();
        new Thread(new MyThread1(cd,"C")).start();
        new Thread(new MyThread1(cd,"D")).start();
        new Thread(new MyThread1(cd,"F")).start();
        new Thread(new MyThread1(cd,"H")).start();
        new Thread(new MyThread1(cd,"G")).start();
    }
}

class MyThread1 implements Runnable {
    CyclicBarrier cyclicBarrier;
    String name;

    MyThread1(CyclicBarrier c, String name) {
        cyclicBarrier = c;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);

        try {
            cyclicBarrier.await();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

class BarAction implements Runnable {
    @Override
    public void run() {
        System.out.println("Barrier Reached!");
    }
}
