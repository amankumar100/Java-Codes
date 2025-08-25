// Question: Write a Java program to generate Tribonacci numbers up to n terms.

import java.util.*;

public class TribonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long a = 0, b = 1, c = 1;
        System.out.print("Tribonacci series: " + a + " " + b + " " + c);

        for (int i = 3; i < n; i++) {
            long d = a + b + c;
            System.out.print(" " + d);
            a = b;
            b = c;
            c = d;
        }
        sc.close();
    }
}
