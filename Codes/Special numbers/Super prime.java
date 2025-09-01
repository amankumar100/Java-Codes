// Question: Write a Java program to check if a number is a Super Prime.

import java.util.*;

public class SuperPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int primePosition(int num) {
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (isPrime(i)) count++;
            if (i == num) return count;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            int pos = primePosition(num);
            if (isPrime(pos)) {
                System.out.println(num + " is a Super Prime.");
            } else {
                System.out.println(num + " is not a Super Prime.");
            }
        } else {
            System.out.println(num + " is not a Prime number.");
        }
        sc.close();
    }
}
