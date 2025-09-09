// Question: Write a Java program to use a functional interface with a lambda expression.

import java.util.*;

@FunctionalInterface
interface MyOperation {
    int operate(int a, int b);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyOperation add = (a, b) -> a + b;
        MyOperation mul = (a, b) -> a * b;

        System.out.println("Addition: " + add.operate(10, 20));
        System.out.println("Multiplication: " + mul.operate(5, 6));
    }
}