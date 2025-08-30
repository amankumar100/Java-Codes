// Question: Write a Java program to implement Jump Search.

import java.util.*;

public class JumpSearch {
    public static int jumpSearch(int arr[], int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < x) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n) return -1;
        }

        while (arr[prev] < x) {
            prev++;
            if (prev == Math.min(step, n)) return -1;
        }

        if (arr[prev] == x) return prev;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter sorted elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        int result = jumpSearch(arr, x);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
        sc.close();
    }
}
