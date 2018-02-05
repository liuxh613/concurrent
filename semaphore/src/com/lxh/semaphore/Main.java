package com.lxh.semaphore;

public class Main {
    public static void main(String[] args) {
        PrintQueue printQueue = new PrintQueue();

        for (int i = 0; i <10 ; i++) {
            Job job = new Job(printQueue);
            Thread thread = new Thread(job);
            thread.start();
        }
    }
}
