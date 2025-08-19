// Question: Write a Java program to calculate the sum of all even numbers up to n.

import java.util.*;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 2; i <= n; i += 2) {
            sum += i;
        }

        System.out.println("Sum of even numbers up to " + n + " is: " + sum);
        sc.close();
    }
}
