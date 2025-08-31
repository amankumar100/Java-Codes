// Question: Write a Java program to find the smallest of three numbers.

import java.util.*;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int smallest = a;
        if (b < smallest) smallest = b;
        if (c < smallest) smallest = c;

        System.out.println("Smallest number is: " + smallest);
        sc.close();
    }
}
