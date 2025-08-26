// Question: Write a Java program to check if two numbers are Twin Primes.

import java.util.*;

public class TwinPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (isPrime(a) && isPrime(b) && Math.abs(a - b) == 2) {
            System.out.println(a + " and " + b + " are Twin Primes.");
        } else {
            System.out.println(a + " and " + b + " are not Twin Primes.");
        }
        sc.close();
    }
}
