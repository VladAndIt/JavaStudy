package Part_2.Chapter_23_Concurrency_Utilities.ForkJoinSimple;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinTaskDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        ForkJoinPool pool = ForkJoinPool.commonPool();
        double nums[] = new double[100000000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        System.out.println("A portion of the original sequence: ");

        for (int i = 0; i < 10; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);
        //pool.invoke(task);
        task.invoke();
        System.out.println("A portion of the transformed sequence " + " (to four decimal places):");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%.2f ", nums[i]);
        }
        System.out.println();
        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}

class SqrtTransform extends RecursiveAction {
    final int seqThreshold = 100;

    double[] data;

    int start, end;

    SqrtTransform(double[] vals, int s, int end) {
        data = vals;
        start = s;
        this.end = end;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i])*Math.toRadians(2)*Math.pow(i,i);
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new SqrtTransform(data, start, middle), new SqrtTransform(data, middle, end));
        }
    }
}