// Question: Write a Java program to calculate the sum of first n natural numbers.

import java.util.*;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2; // formula for sum of first n natural numbers
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
    }
}
