// Question: Write a Java program to check if a number is a Sunny number.

import java.util.*;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int check = num + 1;
        int sqrt = (int) Math.sqrt(check);

        if (sqrt * sqrt == check) {
            System.out.println(num + " is a Sunny number.");
        } else {
            System.out.println(num + " is not a Sunny number.");
        }
        sc.close();
    }
}
