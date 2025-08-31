// Question: Write a Java program to implement a simple Calculator using switch case.

import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Division by zero not allowed.");
                    sc.close();
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator.");
                sc.close();
                return;
        }

        System.out.println("Result = " + result);
        sc.close();
    }
}