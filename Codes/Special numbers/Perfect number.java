// Question: Write a Java program to check if a number is a Perfect number.

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }
        sc.close();
    }
}
