// Question: Write a Java program to find the factorial of a given number using recursion.

import java.util.*;

public class Factorial {
    public static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }
        sc.close();
    }
}
