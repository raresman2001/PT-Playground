package org.example2;

import org.example2.operations.Addition;
import org.example2.operations.Multiplication;
import org.example2.operations.Operation;
import org.example2.operations.Subtraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter the operation symbol");

        var reader = new BufferedReader(new InputStreamReader(System.in));
        ComputationOfInts computation = new ComputationOfInts(10, 15);
        Operation operation = symbolToStrategy(reader.readLine());

        while (operation != null) {
            computation.setOperation(operation);
            System.out.printf("Result is: %d\n", computation.compute());
            operation = symbolToStrategy(reader.readLine());
        }

    }

    private static Operation symbolToStrategy(String op) {
        return switch (op) {
            case "+" -> new Addition();
            case "-" -> new Subtraction();
            case "*" -> new Multiplication();
            default -> null;
        };
    }
}
