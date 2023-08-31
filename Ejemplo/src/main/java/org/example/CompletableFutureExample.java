package org.example;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;

public class CompletableFutureExample {

    public static void main(String[] args) {
        CompletableFuture<Integer> task1 = CompletableFuture.supplyAsync(() -> generateRandomNumber());
        CompletableFuture<Integer> task2 = CompletableFuture.supplyAsync(() -> generateRandomNumber());
        CompletableFuture<Integer> task3 = CompletableFuture.supplyAsync(() -> generateRandomNumber());
        CompletableFuture<Integer> task4 = CompletableFuture.supplyAsync(() -> generateRandomNumber());

        CompletableFuture<Integer> allTasks = CompletableFuture.allOf(task1, task2, task3, task4)
                .thenApplyAsync(ignored -> task1.join() + task2.join() + task3.join() + task4.join());

        allTasks.thenAccept(result -> System.out.println("Suma de números aleatorios: " + result));


        try {
            allTasks.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt(100, 501);
    }
}
