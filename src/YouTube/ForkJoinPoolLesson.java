package YouTube;

import java.util.Date;
import java.util.concurrent.CountedCompleter;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolLesson {
    public static long operation = 10_000_000_000L;
    public static int core = Runtime.getRuntime().availableProcessors();
    private static final long loadFactor = 100;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();//0.628
//        long i =0;
//        for (long j = 0; j < operation; j++) {
//            i+=j;
//        }
        ForkJoinPool pool = new ForkJoinPool(core);
        pool.invoke(new MyTask(0, operation));

//        System.out.println(new Date());
        System.out.println("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }

    static class MyFork extends RecursiveTask<Long> {
        private long from;
        private long to;


        MyFork(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        protected Long compute() {
            if ((to - from) <= operation / (core * loadFactor)) {
                long i = 0;
                for (long j = from; j < to; j++) {
                    i += j;
                }
                return i;
            } else {
//                System.out.println("YES");
                ForkJoinTask<Long> fork1, fork2;

                long middle = (to + from) >>> 1;
                fork1 = new MyFork(middle, to);
                fork2 = new MyFork(from, middle);

                ForkJoinTask.invokeAll(fork1, fork2);

                return fork1.join() + fork2.join();
            }
        }
    }

    static class MyTask extends CountedCompleter<Void> {
        private long from;
        private long to;

        public MyTask(CountedCompleter<?> parent, long from, long to) {
            super(parent);
            this.from = from;
            this.to = to;

        }

        public MyTask(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void compute() {
            if ((to - from) <= operation / (core * loadFactor)) {
                long i = 0;
                for (long j = from; j < to; j++) {
                    i += j;
                };
            } else {
                setPendingCount(2);
                long middle = (to + from) >>> 1;
                new MyTask(this,middle, to).fork();
                new MyTask(this,from, middle).fork();
            }
            tryComplete();
        }
    }
}
