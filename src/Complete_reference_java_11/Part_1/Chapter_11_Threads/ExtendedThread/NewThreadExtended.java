package Complete_reference_java_11.Part_1.Chapter_11_Threads.ExtendedThread;

public class NewThreadExtended extends Thread{

    NewThreadExtended(){
        super("Example thread!");
        System.out.println("The second thread is created ");
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println("The second thread" + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println("The second thread is interrupted " + e);
        }       System.out.println("The second thread is finished!");
    }
}
