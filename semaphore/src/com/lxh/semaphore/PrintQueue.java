package com.lxh.semaphore;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class PrintQueue {
    private final Semaphore semaphore;

    public PrintQueue() {
        this.semaphore = new Semaphore(1);
    }

    public void PrintFile(String name) {
        try {
            semaphore.acquire();
            System.out.printf("%s : Going to print a job!\n", name);
            long duration = (long) (Math.random() * 10);
            System.out.printf("%s : PrintQueue: Printing a job during %d seconds \n", name, duration);
            //Thread.sleep(duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            semaphore.release();
        }

    }
}
