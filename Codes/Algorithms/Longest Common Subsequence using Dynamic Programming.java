// Question: Write a Java program to find the Longest Common Subsequence (LCS) of two strings using DP.

import java.util.*;

public class LCS {
    static int lcs(String X, String Y, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else if (X.charAt(i - 1) == Y.charAt(j - 1))
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String X = sc.nextLine();
        System.out.print("Enter second string: ");
        String Y = sc.nextLine();

        System.out.println("Length of LCS: " + lcs(X, Y, X.length(), Y.length()));
        sc.close();
    }
}
