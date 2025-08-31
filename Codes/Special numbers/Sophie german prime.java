// Question: Write a Java program to check if a number is a Sophie Germain Prime.

import java.util.*;

public class SophieGermainPrime {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num) && isPrime(2 * num + 1)) {
            System.out.println(num + " is a Sophie Germain Prime.");
        } else {
            System.out.println(num + " is not a Sophie Germain Prime.");
        }
        sc.close();
    }
}
