package Chapter_11_Threads.JoinAndIsAlive;

public class ThreadDemoMulti {
    public static void main(String[] args) {
        NewJoinThreads thread1 = new NewJoinThreads("First");
        NewJoinThreads thread2 = new NewJoinThreads("Second");
        NewJoinThreads thread3 = new NewJoinThreads("Third");

        System.out.println("Lunch the first " + thread1.t.isAlive());
        System.out.println("Lunch the second " + thread2.t.isAlive());
        System.out.println("Lunch the third " + thread3.t.isAlive());

        try {
            System.out.println("Waiting for finish the threads.");
            thread1.t.join();
            thread2.t.join();
            thread3.t.join();
        }catch (InterruptedException e){
            System.out.println("The main thread is interrupted " + e);
        }       System.out.println("The main thread is finished!");

        System.out.println("Finish the first " + thread1.t.isAlive());
        System.out.println("Finish the second " + thread2.t.isAlive());
        System.out.println("Finish the third " + thread3.t.isAlive());

        System.out.println("The main thread is finished!");
    }
}
