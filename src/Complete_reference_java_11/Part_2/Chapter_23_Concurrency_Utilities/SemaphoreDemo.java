package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.Semaphore;

public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1,true);

        new Thread(new IncThread(sem, "A")).start();
        new Thread(new DecThread(sem, "B")).start();
    }
}

class Shared {
    static int count = 0;
}
class IncThread implements Runnable {
    String name;
    Semaphore semaphore;

    IncThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {
            System.out.println(name + " is waiting for a permit.");
            semaphore.acquire();
            System.out.println(name + " gets a permit.");

            for (int i = 0; i < 5; i++) {
                Shared.count++;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " releases the permission.");
        semaphore.release();
    }
}
class DecThread implements Runnable {
    String name;
    Semaphore semaphore;

    DecThread(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Starting " + name);

        try {
            System.out.println(name + " is waiting for a permit.");
            semaphore.acquire();
            System.out.println(name + " gets a permit.");

            for (int i = 0; i < 5; i++) {
                Shared.count--;
                System.out.println(name + ": " + Shared.count);
                Thread.sleep(10);
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " releases the permission.");
        semaphore.release();
    }
}
