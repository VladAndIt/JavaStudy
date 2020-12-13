package Complete_reference_java_11.Part_1.Chapter_11_Threads.MainThread;

class MyThread {
    public static void main(String[] args) {
        Thread currentThread = Thread.currentThread();
        System.out.println("Current main thread is " + currentThread);

        currentThread.setName("CodWars.MainWars thread");
        System.out.println("After changing name main thread is " + currentThread);

        try {
            for (int i = 5; i > 0 ; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.print("Exception: Interrupt the thread! ");
        }
    }
}
