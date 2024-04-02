package org.example3.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private final BlockingQueue<Integer> blockingQueue;

    public Consumer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Waiting to get new int...");
                var value = blockingQueue.take();
                System.out.printf("Got: %d\n", value);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
