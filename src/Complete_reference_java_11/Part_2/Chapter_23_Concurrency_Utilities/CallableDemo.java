package Complete_reference_java_11.Part_2.Chapter_23_Concurrency_Utilities;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Integer> future;
        Future<Double> future2;
        Future<Integer> future3;

        System.out.println("Launch");

        future = es.submit(new Sum(10));
        future2 = es.submit(new Hypot(3,5));
        future3 = es.submit(new Factorial(10));

        try {
            System.out.println(future.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        es.shutdown();
        System.out.println("Done");
    }
}

class Sum implements Callable<Integer> {
    int stop;

    Sum(int v) {
        stop = v;
    }

    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i <= stop; i++) {
            sum += i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double> {
    double side1, side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double call() throws Exception {
        return Math.sqrt((side1 * side1) + (side2 * side2));
    }
}

class Factorial implements Callable<Integer> {
    int stop;

    Factorial(int v) {
        stop = v;
    }
    @Override
    public Integer call() throws Exception {
        int fact = 1;
        for (int i = 2; i <= stop; i++) {
            fact *= i;
        }
        return fact;
    }
}
