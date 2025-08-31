// Question: Write a Java program to find the LCM (Least Common Multiple) of two numbers.

import java.util.*;

public class LCM {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
        sc.close();
    }
}
