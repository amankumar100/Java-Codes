// Question: Write a Java program to check if a number is an Ugly number.

import java.util.*;

public class UglyNumber {
    public static boolean isUgly(int n) {
        if (n <= 0) return false;
        int[] factors = {2, 3, 5};
        for (int f : factors) {
            while (n % f == 0) n /= f;
        }
        return n == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isUgly(num)) {
            System.out.println(num + " is an Ugly number.");
        } else {
            System.out.println(num + " is not an Ugly number.");
        }
        sc.close();
    }
}
