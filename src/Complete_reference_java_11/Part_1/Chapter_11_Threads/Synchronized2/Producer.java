package Complete_reference_java_11.Part_1.Chapter_11_Threads.Synchronized2;

public class Producer implements Runnable {
    Queue q;

    public Producer(Queue q) {
        this.q = q;
        new Thread(this,"Producer").start();

    }

    @Override
    public void run() {
        int i = 0;
        while(true){
            q.put(i++);
        }
    }
}
