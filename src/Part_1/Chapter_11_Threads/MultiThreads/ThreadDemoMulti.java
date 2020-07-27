package Part_1.Chapter_11_Threads.MultiThreads;

public class ThreadDemoMulti {
    public static void main(String[] args) {
        new NewMultiThreads("First");
        new NewMultiThreads("Second");
        new NewMultiThreads("Third");

        try {
                Thread.sleep(10000);
        }catch (InterruptedException e){
            System.out.println("The main thread is interrupted " + e);
        }       System.out.println("The main thread is finished!");

    }
}
