// Question: Write a Java program to find the length of Longest Increasing Subsequence (LIS) using DP.

import java.util.*;

public class LIS {
    static int lis(int arr[], int n) {
        int lis[] = new int[n];
        Arrays.fill(lis, 1);

        for (int i = 1; i < n; i++)
            for (int j = 0; j < i; j++)
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
                    lis[i] = lis[j] + 1;

        int max = 0;
        for (int i = 0; i < n; i++) max = Math.max(max, lis[i]);
        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Length of LIS: " + lis(arr, n));
        sc.close();
    }
}
