// Question: Write a Java program to check if a number is a Smith number.

import java.util.*;

public class SmithNumber {
    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number, hence not a Smith number.");
            return;
        }

        int sumDigits = digitSum(num);
        int sumFactors = 0, temp = num;

        for (int i = 2; i <= temp; i++) {
            while (temp % i == 0) {
                sumFactors += digitSum(i);
                temp /= i;
            }
        }

        if (sumDigits == sumFactors) {
            System.out.println(num + " is a Smith number.");
        } else {
            System.out.println(num + " is not a Smith number.");
        }
        sc.close();
    }
}
