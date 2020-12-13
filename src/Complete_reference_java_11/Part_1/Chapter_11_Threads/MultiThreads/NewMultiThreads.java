package Complete_reference_java_11.Part_1.Chapter_11_Threads.MultiThreads;

public class NewMultiThreads implements Runnable{
    String name;
    Thread t;

    NewMultiThreads(String name){
        this.name = name;
        t = new Thread(this,this.name);
        System.out.println(name + " : " + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(name + " : " + i);
                Thread.sleep(500);
            }
        }catch (InterruptedException e){
            System.out.println(name + " : The second thread is interrupted " + e);
        }       System.out.println(name + " : The second thread is finished!");
    }
}
