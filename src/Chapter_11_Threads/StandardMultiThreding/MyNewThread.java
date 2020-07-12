package Chapter_11_Threads.StandardMultiThreding;

public class MyNewThread implements  Runnable{
    String name;
    Thread t;
    boolean suspendFlag;

    MyNewThread(String name){
        this.name = name;
        t = new Thread(this,name);
        System.out.println("New thread: " + name);
        suspendFlag = false;
        t.start();
    }
    @Override
    public void run() {
        try {
            for (int i = 15; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        }catch(InterruptedException e){
            System.out.println(name + "is interrupted");
        }System.out.println(name + "is finished");
    }
    synchronized void mysuspend(){
        suspendFlag = true;
    }
    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}
