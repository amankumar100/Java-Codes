// Question: Write a Java program to generate Pell numbers up to n terms.

import java.util.*;

public class PellNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long a = 0, b = 1;
        System.out.print("Pell series: " + a + " " + b);

        for (int i = 2; i < n; i++) {
            long c = 2 * b + a;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        sc.close();
    }
}
