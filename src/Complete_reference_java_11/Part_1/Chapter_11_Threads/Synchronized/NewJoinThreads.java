package Complete_reference_java_11.Part_1.Chapter_11_Threads.Synchronized;

public class NewJoinThreads implements Runnable{
    String msg;
    CallMe target;
    Thread t;

    NewJoinThreads(CallMe targ, String s){
        target = targ;
        msg = s;
        t = new Thread(this);
        System.out.println(s + " : " + t);
        t.start();
    }

    @Override
    public void run() {
        synchronized (target){
            target.call(msg);
        }
    }
}
