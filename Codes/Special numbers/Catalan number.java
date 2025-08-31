// Question: Write a Java program to generate Catalan numbers up to n terms.

import java.util.*;

public class CatalanNumber {
    public static long fact(int n) {
        long f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static long catalan(int n) {
        return fact(2 * n) / (fact(n + 1) * fact(n));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        System.out.println("First " + n + " Catalan numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(catalan(i) + " ");
        }
        sc.close();
    }
}
