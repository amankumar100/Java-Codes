// Question: Write a Java program to check if a number is an Automorphic number.

import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        String n = String.valueOf(num);
        String sq = String.valueOf(square);

        if (sq.endsWith(n)) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }
        sc.close();
    }
}
