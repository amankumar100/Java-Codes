// Question: Write a Java program to check if a number is a Niven (Harshad) number.

import java.util.*;

public class NivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sum = 0, temp = num;
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0) {
            System.out.println(num + " is a Niven (Harshad) number.");
        } else {
            System.out.println(num + " is not a Niven (Harshad) number.");
        }
        sc.close();
    }
}
