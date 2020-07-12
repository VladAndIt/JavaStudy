package Chapter_11_Threads.Synchronized;

public class ThreadDemo1 {
    public static void main(String[] args) {

        CallMe target = new CallMe();
        NewJoinThreads thread1 = new NewJoinThreads(target,"Welcome to ");
        NewJoinThreads thread2 = new NewJoinThreads(target,"synchronize");
        NewJoinThreads thread3 = new NewJoinThreads(target,"world!");

        try {
            thread3.t.join();
            thread2.t.join();
            thread1.t.join();
        }catch (InterruptedException e){
            System.out.println("Interrupted " + e);
        }

        System.out.println("The main thread is finished!");
    }
}
