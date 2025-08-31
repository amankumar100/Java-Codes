// Question: Write a Java program to generate Lucas numbers up to n terms.

import java.util.*;

public class LucasNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long a = 2, b = 1;
        System.out.print("Lucas series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        sc.close();
    }
}
