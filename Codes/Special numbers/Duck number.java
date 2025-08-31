// Question: Write a Java program to check if a number is a Duck number.

import java.util.*;

public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = sc.next();

        if (num.charAt(0) == '0') {
            System.out.println(num + " is not a Duck number (leading zero not allowed).");
        } else if (num.contains("0")) {
            System.out.println(num + " is a Duck number.");
        } else {
            System.out.println(num + " is not a Duck number.");
        }
        sc.close();
    }
}
