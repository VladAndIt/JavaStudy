package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.Semaphore;


public class QueueDifficultSemaphore {
    public static void main(String[] args) {
        Queue queue = new Queue();
        new Thread(new Consumer(queue), "Consumer").start();
        new Thread(new Producer(queue), "Producer").start();
    }
}

class Queue {
    int n;

    static Semaphore semConsumer = new Semaphore(0);
    static Semaphore semProducer = new Semaphore(1);

    void get() {
        try {
            semConsumer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(" Received " + n);
        semProducer.release();
    }

    void put(int n) {
        try {
            semProducer.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.n = n;
        System.out.println("Send: " + n);
        semConsumer.release();
    }
}

class Producer implements Runnable {
    Queue queue;

    Producer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) queue.put(i);
    }
}

class Consumer implements Runnable {
    Queue queue;

    Consumer(Queue queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) queue.get();
    }
}
