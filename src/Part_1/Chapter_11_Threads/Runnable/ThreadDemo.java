package Part_1.Chapter_11_Threads.Runnable;

public class ThreadDemo {
    public static void main(String[] args) {
        new NewThreads();
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("The main thread" + i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("The main thread is interrupted " + e);
        }       System.out.println("The main thread is finished!");

    }
}
