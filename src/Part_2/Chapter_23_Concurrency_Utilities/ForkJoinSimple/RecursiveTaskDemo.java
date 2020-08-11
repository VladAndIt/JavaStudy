package Part_2.Chapter_23_Concurrency_Utilities.ForkJoinSimple;

import java.util.concurrent.RecursiveTask;

public class RecursiveTaskDemo {
    public static void main(String[] args) {

        double nums[] = new double[5000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (double) (((i % 2) == 0) ? i : -i);
        }

        Sum task = new Sum(nums, 0, nums.length);

        double summation = task.invoke();

        System.out.printf("Summation " + summation);
    }
}

class Sum extends RecursiveTask<Double> {

    final int seqThresHold = 500;

    double data[];

    int start,end;

    public Sum(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }


    protected Double compute() {
        double sum = 0;
        if ((end - start) < seqThresHold) {
            for (int i = start; i < end; i++) {
                sum += data[i];
            }
        } else {
            int middle = (start + end) / 2;
            Sum subTaskA = new Sum(data, start, middle);
            Sum subTaskB = new Sum(data, middle, end);

            subTaskA.fork();
            subTaskB.fork();

//            sum = subTaskA.join() + subTaskB.join();
//            sum = subTaskA.join() + subTaskB.compute();
            sum = subTaskA.invoke() + subTaskB.compute();
        }

        return sum;
    }
}