// Question: Write a Java program to implement Fibonacci Search.

import java.util.*;

public class FibonacciSearch {
    public static int fibonacciSearch(int arr[], int x) {
        int n = arr.length;

        int fib2 = 0; // (m-2)'th Fibonacci number
        int fib1 = 1; // (m-1)'th Fibonacci number
        int fib = fib2 + fib1; // m'th Fibonacci number

        while (fib < n) {
            fib2 = fib1;
            fib1 = fib;
            fib = fib2 + fib1;
        }

        int offset = -1;

        while (fib > 1) {
            int i = Math.min(offset + fib2, n - 1);

            if (arr[i] < x) {
                fib = fib1;
                fib1 = fib2;
                fib2 = fib - fib1;
                offset = i;
            } else if (arr[i] > x) {
                fib = fib2;
                fib1 = fib1 - fib2;
                fib2 = fib - fib1;
            } else {
                return i;
            }
        }

        if (fib1 == 1 && offset + 1 < n && arr[offset + 1] == x) {
            return offset + 1;
        }

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

        int result = fibonacciSearch(arr, x);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found.");
        sc.close();
    }
}
