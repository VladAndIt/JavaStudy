package Complete_reference_java_11.Part_1.Chapter_11_Threads.ExtendedThread;

public class ThreadExtended {
    public static void main(String[] args) {
        new NewThreadExtended();
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
