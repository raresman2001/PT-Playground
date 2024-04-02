package org.example2;

import org.example2.operations.Operation;

public class ComputationOfInts {

    private final int a;
    private final int b;
    private Operation operation;

    public ComputationOfInts(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int compute() {
        return operation.executeOperation(a, b);
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }
}
