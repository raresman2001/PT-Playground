package org.example3;

import org.example3.blockingQueue.Consumer;
import org.example3.blockingQueue.Producer;

import java.util.concurrent.SynchronousQueue;

public class Main {

    public static void main(String[] args) {

        var queue = new SynchronousQueue<Integer>();
        var threadProd = new Thread(new Producer(queue));
        var threadCons = new Thread(new Consumer(queue));

        threadProd.start();
        threadCons.start();
    }

}
