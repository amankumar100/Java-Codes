// Question: Write a Java program to check if a number is a Kaprekar number.

import java.util.*;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        long square = (long) num * num;
        String str = String.valueOf(square);
        int d = String.valueOf(num).length();

        String rightPart = str.substring(str.length() - d);
        String leftPart = (str.length() == d) ? "0" : str.substring(0, str.length() - d);

        int left = Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);

        if (left + right == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
        sc.close();
    }
}
