package org.example.parallelism;

public class ParallelExecutionClass implements Runnable {

    private final SharedParam param;

    public ParallelExecutionClass(SharedParam param) {
        this.param = param;
    }

    @Override
    public void run() {
        while (!param.stop) {
            try {
                param.threadSafeCounter.addAndGet(2);
                param.unsafeCounter += 2;
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
