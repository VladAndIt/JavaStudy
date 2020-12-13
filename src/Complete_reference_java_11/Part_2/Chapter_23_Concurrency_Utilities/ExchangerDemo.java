package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.Exchanger;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exgr = new Exchanger<>();

        new Thread(new UseString(exgr)).start();
        new Thread(new MakeString(exgr)).start();
    }
}

class MakeString implements Runnable {
    Exchanger<String> ex;
    String str;

    public MakeString(Exchanger<String> ex) {
        this.ex = ex;
        this.str = new String();
    }

    @Override
    public void run() {
        char ch = 'A';

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str += ch++;
            }
            try {
                str = ex.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UseString implements Runnable {
    Exchanger<String> ex;
    String str;

    public UseString(Exchanger<String> exchanger) {
        this.ex = exchanger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                str = ex.exchange(new String());
                System.out.printf("\nGot: " + str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}