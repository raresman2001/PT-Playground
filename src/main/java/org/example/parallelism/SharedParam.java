package org.example.parallelism;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedParam {
    public volatile AtomicInteger threadSafeCounter;
    public volatile int unsafeCounter;
    public volatile boolean stop = false;

    public SharedParam(int counter) {
        this.threadSafeCounter = new AtomicInteger(counter);
        this.unsafeCounter = counter;
    }
}
