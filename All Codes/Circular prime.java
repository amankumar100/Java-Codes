// Question: Write a Java program to check if a number is a Circular Prime.

import java.util.*;

public class CircularPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isCircularPrime(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int rotated = Integer.parseInt(s.substring(i) + s.substring(0, i));
            if (!isPrime(rotated)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isCircularPrime(num)) {
            System.out.println(num + " is a Circular Prime.");
        } else {
            System.out.println(num + " is not a Circular Prime.");
        }
        sc.close();
    }
}
