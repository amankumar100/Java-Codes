// Question: Write a Java program to find the factorial of a number without using recursion.

import java.util.*;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long fact = 1;
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            System.out.println("Factorial of " + n + " is: " + fact);
        }
        sc.close();
    }
}
