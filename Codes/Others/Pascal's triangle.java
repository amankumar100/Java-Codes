// Question: Write a Java program to print Pascal's Triangle up to n rows.

import java.util.*;

public class PascalsTriangle {
    private static long nCr(int n, int r) {
        long res = 1;
        for (int i = 1; i <= r; i++) {
            res = res * (n - r + i) / i;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // spacing for a centered look (optional)
            for (int sp = 0; sp < n - i - 1; sp++) System.out.print(" ");
            for (int j = 0; j <= i; j++) System.out.print(nCr(i, j) + " ");
            System.out.println();
        }
        sc.close();
    }
}
