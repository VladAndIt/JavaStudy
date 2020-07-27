package Part_1.Chapter_11_Threads.Synchronized;

public class CallMe{
    synchronized void call(String msg){
        System.out.print("["+msg);
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }System.out.print("]");
    }
}

