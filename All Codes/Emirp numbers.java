// Question: Write a Java program to check if a number is an Emirp number.

import java.util.*;

public class EmirpNumber {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int rev = reverse(num);
        if (isPrime(num) && isPrime(rev) && num != rev) {
            System.out.println(num + " is an Emirp number.");
        } else {
            System.out.println(num + " is not an Emirp number.");
        }
        sc.close();
    }
}
