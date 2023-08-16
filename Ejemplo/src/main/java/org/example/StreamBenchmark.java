package org.example;

import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
public class StreamBenchmark {

    @Param({"10000000"}) // Tamaño de la lista
    private int size;

    private List<Integer> list;

    @Setup(Level.Trial)
    public void setUp() {
        Random random = new Random();
        list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(50000) + 1);
        }
    }

    @Benchmark
    public List<Integer> filterSequential() {
        return list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    @Benchmark
    public List<Integer> filterParallel() {
        return list.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }
}