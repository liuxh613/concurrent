package com.lxh.semaphore;

public class Job implements Runnable {
    private PrintQueue printQueue;

    public Job(PrintQueue printQueue) {
        this.printQueue = printQueue;
    }

    @Override
    public void run() {

        printQueue.PrintFile(Thread.currentThread().getName());
    }
}
