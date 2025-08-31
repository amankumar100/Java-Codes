// Question: Write a Java program to read an r x c matrix and print its transpose.

import java.util.*;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Rows and Columns: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] a = new int[r][c];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = a[i][j];

        System.out.println("Transpose:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(t[i][j] + " ");
            System.out.println();
        }
        sc.close();
    }
}
