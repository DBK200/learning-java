package com.sessions.session_concurency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> System.out.println("task 1");
        Runnable task2 = () -> System.out.println("task 2");
        Runnable task3 = () -> System.out.println("task 3");
        Runnable task4 = () -> System.out.println("task 4");
        Runnable task5 = () -> System.out.println("task 5");

        // They're executed in batches of 2
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        executorService.shutdown();
    }
}
