package Complete_reference_java_11.Part_1.Chapter_11_Threads.Synchronized2;

public class Queue {
    int n;
    boolean valueSet = false;

    synchronized  int get(){
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception :" + e);
            }
        }
        System.out.println("Get :" + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n){
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Exception :" + e);
            }
        }
        this.n = n;
        valueSet = true;
        System.out.println("Send " + n);
        notify();
    }
}
