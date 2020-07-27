package Part_1.Chapter_11_Threads.Runnable;

public class NewThreads implements Runnable{
    Thread t;

    NewThreads(){
        t = new Thread(this,"Example thread!");
        System.out.println("The second thread is created " + t);
        t.start();
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
