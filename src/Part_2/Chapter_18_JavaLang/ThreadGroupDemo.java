package Part_2.Chapter_18_JavaLang;

public class ThreadGroupDemo{
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        ThreadGroup groupA = new ThreadGroup("Group A");
        ThreadGroup groupB = new ThreadGroup("Group B");

        NewThreadDemo ob1 = new NewThreadDemo("One",groupA);
        NewThreadDemo ob2 = new NewThreadDemo("Two",groupA);
        NewThreadDemo ob3 = new NewThreadDemo("Three",groupB);
        NewThreadDemo ob4 = new NewThreadDemo("Four",groupB);

        ob1.start();
        ob2.start();
        ob3.start();
        ob4.start();

        System.out.println("\nHere is output from list():");
        groupA.list();
        groupB.list();
        System.out.println("Suspending Group A");
        Thread tga[] = new Thread[groupA.activeCount()];
        groupA.enumerate(tga);
        for (int i = 0; i < tga.length; i++) {
            ((NewThreadDemo)tga[i]).mysuspend();
        }
        Thread.sleep(4000);

        System.out.println("Resuming Group A");
        for (int i = 0; i < tga.length; i++) {
            ((NewThreadDemo)tga[i]).myresume();
        }

        try {
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting!");


        var Info = new StringBuilder();
        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");
        System.out.println(Info);
    }
}

class NewThreadDemo extends Thread {
    boolean suspendFlag;

    NewThreadDemo(String threadname, ThreadGroup thOb) {
        super(thOb,threadname);
        System.out.println("New thread : " + this);
        suspendFlag = false;
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(getName() + " exiting.");
    }
    synchronized void mysuspend(){
        suspendFlag = true;
    }
    synchronized void myresume(){
        suspendFlag = false;
        notify();
    }
}

