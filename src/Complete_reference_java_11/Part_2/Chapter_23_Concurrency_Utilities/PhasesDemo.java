package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.Phaser;

public class PhasesDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int curPhase;

        System.out.println("String");

        new Thread(new MyThread2(phaser, "A")).start();
        new Thread(new MyThread2(phaser, "B")).start();
        new Thread(new MyThread2(phaser, "C")).start();

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        curPhase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + curPhase + " Complete");

        phaser.arriveAndDeregister();

        if (phaser.isTerminated()) {
            System.out.println("The Phaser is terminated");
        }
    }
}

class MyThread2 implements Runnable {
    Phaser phaser;
    String name;

    MyThread2(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        System.out.println("Thread " + name + " Beginning Phase One");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " Beginning Phase Two");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread " + name + " Beginning Phase Three");
        phaser.arriveAndDeregister();
    }
}