package Part_2.Chapter_19_JavaUtils;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class MyTimerTask {
    public static void main(String[] args) {
        MyTimer myTask = new MyTimer();
        Timer myTimer = new Timer();

        myTimer.schedule(myTask,1000,500);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        myTimer.cancel();
    }
}

class MyTimer extends TimerTask {
    @Override
    public void run() {
        System.out.println(new Date());
//        System.out.println("Timer task executed!");
    }
}