package org.example3.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private final BlockingQueue<Integer> blockingQueue;

    public Producer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        int i = 0;
        while (true) {
            try {
                System.out.println("Waiting to add...");
                Thread.sleep(1000);
                blockingQueue.add(i++);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
