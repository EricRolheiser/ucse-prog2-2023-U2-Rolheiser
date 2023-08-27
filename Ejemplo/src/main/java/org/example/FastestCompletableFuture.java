package org.example;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutionException;

public class FastestCompletableFuture {

    public static void main(String[] args) {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> generateRandomNumber());
        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> generateRandomNumber());
        CompletableFuture<Integer> task3 = CompletableFuture.supplyAsync(() -> generateRandomNumber());
        CompletableFuture<Integer> task4 = CompletableFuture.supplyAsync(() -> generateRandomNumber());

        CompletableFuture<Integer> fastestTask = CompletableFuture.anyOf(task1, task2, task3, task4)
                .thenApplyAsync(result -> {
                    try {
                        return (Integer) result;
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        try {
            int fastestValue = fastestTask.get();
            System.out.println("Fastest value: " + fastestValue);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(100, 501);
    }
}