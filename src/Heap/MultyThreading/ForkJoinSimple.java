package Heap.MultyThreading;

import lombok.extern.java.Log;

import javax.print.DocFlavor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.stream.LongStream;
@Log
public class ForkJoinSimple{


    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        long[] number = LongStream.rangeClosed(1, 10_000_000L).toArray();
        ForkJoinTask<Long> task = new ForkJoinPoolSimple(number);
//        ForkJoinPool().invoke(task);
        System.out.println(task.invoke());
        log.info("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");

    }

}

class ForkJoinPoolSimple extends RecursiveTask<Long> {

    private final long[] number;
    private final int start;
    private final int end;

    public static final long THRESHOLD = 10_000;

    public ForkJoinPoolSimple(long[] numbers) {
        this(numbers, 0, numbers.length);
    }

    public ForkJoinPoolSimple(long[] number, int start, int end) {
        this.number = number;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Long compute() {
        int length = end - start;
        if (length <= THRESHOLD) {
            return computeSeq();
        }
        ForkJoinPoolSimple leftTask = new ForkJoinPoolSimple(number, start, start + length / 2);
        leftTask.fork();

        ForkJoinPoolSimple rightTask = new ForkJoinPoolSimple(number, start + length / 2, end);

        Long rightResult = rightTask.compute();
        Long leftResult = leftTask.join();
        return leftResult + rightResult;
    }

    private long computeSeq() {
        long sum = 0;
        for (int i = start; i < end; i++) {
            sum += number[i];
        }
        return sum;
    }
}