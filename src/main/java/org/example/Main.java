package org.example;


import org.example.parallelism.ParallelExecutionClass;
import org.example.parallelism.SharedParam;

public class Main {
    public static void main(String[] args) throws Exception {

        var sharedParam = new SharedParam(3);

        for (int i = 0; i < 10; i++) {
            var thread = new Thread(new ParallelExecutionClass(sharedParam));
            thread.start();
        }

        System.out.print("Press enter to stop");
        System.in.read();
        sharedParam.stop = true;

        System.out.printf("Unsafe counter: %d%n", sharedParam.unsafeCounter);
        System.out.printf("Thread safe counter: %d%n", sharedParam.threadSafeCounter.get());
    }
}