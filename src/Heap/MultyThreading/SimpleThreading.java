package Heap.MultyThreading;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

import java.util.stream.LongStream;
import java.util.stream.Stream;

@Log
public class SimpleThreading {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

//        Long sum = Stream.iterate(1L, i -> i + 1)
//                .limit(10000)
//                .reduce(0L, Long::sum);
//        System.out.println(sum);
//        //0.005sec.
//        Long sum1 = Stream.iterate(1L, i -> i + 1)
//                .limit(10000)
//                .parallel()
//                .reduce(0L, Long::sum);
//        System.out.println(sum1);
//        //0.002sec.
        Long sum2 = LongStream.rangeClosed(1L, 10_000_000L)
                .parallel()
                .reduce(0L, Long::sum);
        System.out.println(sum2);
        //0.002sec.


        log.info("\nTime execution: " + ((System.currentTimeMillis() - startTime) * 1e-3) + " sec.\n");
    }
}
