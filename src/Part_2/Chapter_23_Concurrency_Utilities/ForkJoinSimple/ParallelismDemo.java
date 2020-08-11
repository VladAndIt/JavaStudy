package Part_2.Chapter_23_Concurrency_Utilities.ForkJoinSimple;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ParallelismDemo {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        int pLevel = 4;
        int threshold = 100000;


        ForkJoinPool pool = new ForkJoinPool();

        double nums[] = new double[100000];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) i;
        }

        Transform task = new Transform(nums, 0, nums.length, threshold);

        pool.invoke(task);

        System.out.printf("Level of parallelism: " + pLevel);
        System.out.printf("Sequential threshold: " + threshold);
        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-4) + " sec.\n"  + "Current parallelism: " + pool.getParallelism() + " Exact the amount of process:" + pool.getCommonPoolParallelism() + " available process: " + Runtime.getRuntime().availableProcessors());

    }
}

class Transform extends RecursiveAction {
    int seqThreshold;
    double[] data;
    int start,end;

    public Transform(double[] data, int start,int end, int seqThreshold) {
        this.data = data;
        this.start = start;
        this.end = end;
        this.seqThreshold = seqThreshold;
    }

    @Override
    protected void compute() {
        if ((end - start) < seqThreshold) {
            for (int i = start; i < end; i++) {
                if ((data[i] % 2) == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else{ data[i] = Math.cbrt(data[i]);}
            }
        } else {
            int middle = (start + end) / 2;
            invokeAll(new Transform(data,start,middle,seqThreshold),new Transform(data,middle,end,seqThreshold));
        }
    }
}