// Question: Write a Java program to check if a number is divisibility of 2 numbers.

import java.util.*;

public class DivisibleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter a number to divide " + num + ": ");
        int div = sc.nextInt();
        if (num % div == 0) {
            System.out.println(num + " is divisible by "+div);
        } else {
            System.out.println(num + " is not divisible by "+div);
        }
        sc.close();
    }
}
