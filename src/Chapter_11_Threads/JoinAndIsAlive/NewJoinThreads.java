package Chapter_11_Threads.JoinAndIsAlive;

public class NewJoinThreads implements Runnable{
    String name;
    Thread t;

    NewJoinThreads(String name){
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
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println(name + " : The second thread is interrupted " + e);
        }       System.out.println(name + " : The thread is finished!");
    }
}
