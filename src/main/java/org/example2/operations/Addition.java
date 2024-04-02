package org.example2.operations;

public class Addition implements Operation {
    @Override
    public int executeOperation(int a, int b) {
        return a + b;
    }
}
