// Question: Write a Java program to check if a number is a Pronic number.

import java.util.*;

public class PronicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean pronic = false;
        for (int i = 0; i <= num; i++) {
            if (i * (i + 1) == num) {
                pronic = true;
                break;
            }
        }

        if (pronic) {
            System.out.println(num + " is a Pronic number.");
        } else {
            System.out.println(num + " is not a Pronic number.");
        }
        sc.close();
    }
}
