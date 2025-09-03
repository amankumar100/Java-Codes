// Question: Write a Java program to solve Matrix Chain Multiplication problem using DP.

import java.util.*;

public class MatrixChain {
    static int matrixChainOrder(int p[], int n) {
        int dp[][] = new int[n][n];

        for (int len = 2; len < n; len++) {
            for (int i = 1; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + p[i - 1] * p[k] * p[j];
                    dp[i][j] = Math.min(dp[i][j], q);
                }
            }
        }
        return dp[1][n - 1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of matrices: ");
        int n = sc.nextInt();
        int arr[] = new int[n + 1];
        System.out.println("Enter dimensions:");
        for (int i = 0; i <= n; i++) arr[i] = sc.nextInt();

        System.out.println("Minimum multiplications: " + matrixChainOrder(arr, n + 1));
        sc.close();
    }
}
