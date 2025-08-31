// Question: Write a Java program to check if a number is a Peterson number.

import java.util.*;

public class PetersonNumber {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Peterson number.");
        } else {
            System.out.println(num + " is not a Peterson number.");
        }
        sc.close();
    }
}
