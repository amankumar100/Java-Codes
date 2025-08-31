// Question: Write a Java program to check if a number is an Deficient number.

import java.util.*;

public class DeficientNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println("Deficient Number is not defined for " + n);
            return;
        }

        int sum = 1; // 1 is always a divisor
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;
                if (i != n / i) sum += n / i; // avoid duplicate
            }
        }

        if (sum < n) {
            System.out.println(n + " is a Deficient Number.");
        } else {
            System.out.println(n + " is NOT a Deficient Number.");
        }
    }
}
