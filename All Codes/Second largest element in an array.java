// Question: Write a Java program to find the second largest element in an array.

import java.util.*;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Array must have at least two elements.");
        } else {
            Arrays.sort(arr);
            System.out.println("Second largest element: " + arr[n - 2]);
        }
        sc.close();
    }
}
