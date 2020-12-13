package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.Phaser;

public class AdvancedPhaser {
    public static void main(String[] args) {
        MyPhaser phaser = new MyPhaser(1, 4);
        System.out.println("String\n");

        new Thread(new MyThread3(phaser, "A")).start();
        new Thread(new MyThread3(phaser, "B")).start();
        new Thread(new MyThread3(phaser, "C")).start();

        while (!phaser.isTerminated()) {
            phaser.arriveAndAwaitAdvance();
        }
        System.out.println("The Phaser is terminated");
    }
}

class MyPhaser extends Phaser {
    int numPhases;

    public MyPhaser(int parties, int numCount) {
        super(parties);
        this.numPhases = numCount -1;
    }

    @Override
    protected boolean onAdvance(int phase, int registeredParties) {
        System.out.println("Phase " + phase + "completed.\n");

        if (phase == numPhases || registeredParties == 0) return true;
        return false;
    }
}

class MyThread3 implements Runnable {
    Phaser phaser;
    String name;

    public MyThread3(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
    }

    @Override
    public void run() {
        while (!phaser.isTerminated()) {
            System.out.println("Thread " + name + " Beginning Phase " + phaser.getPhase());

            phaser.arriveAndAwaitAdvance();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}