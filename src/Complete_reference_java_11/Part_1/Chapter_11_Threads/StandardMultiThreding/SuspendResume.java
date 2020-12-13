package Complete_reference_java_11.Part_1.Chapter_11_Threads.StandardMultiThreding;

public class SuspendResume {
    public static void main(String[] args) {
        MyNewThread ob1 = new MyNewThread("first");
        MyNewThread ob2 = new MyNewThread("second");

        try {
            Thread.sleep(1000);
            ob1.mysuspend();
            System.out.println("Interrupting of the first thread");
            Thread.sleep(1000);
            ob1.myresume();
            System.out.println("Resume of the first thread");

            Thread.sleep(1000);
            ob2.mysuspend();
            System.out.println("Interrupting of the second thread");
            Thread.sleep(1000);
            ob2.myresume();
            System.out.println("Resume of the second thread");
        }catch (InterruptedException e){
            System.out.println("CodWars.MainWars thread is interrupted");
        }

        try {
            System.out.println("Waiting for finish of the threads!");
            ob1.t.join();
            ob2.t.join();
        }catch (InterruptedException e){
            System.out.println("CodWars.MainWars thread is interrupted!");
        }System.out.println("CodWars.MainWars thread is finished!");


    }
}
